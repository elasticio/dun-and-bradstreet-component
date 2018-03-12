package io.elastic.dnb;

import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import io.elastic.dnb.soap.client.WSPolicyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringWriter;

public class GenericSOAPClient {

    protected static final Logger logger = LoggerFactory.getLogger(GenericSOAPClient.class);

    public static class Builder<T> {

        private T bodyObject;
        private Class requestClass;

        private String username;
        private String password;

        private SoapAction soapAction;
        private EndpointUrl endpointUrl;

        private static final String NAMESPACE_COM_URI = "http://services.dnb.com/CompanyServiceV2.0";
        private static final String NAMESPACE_COM = "com";

        public Builder setRequestClass(Class requestClass) {
            this.requestClass = requestClass;
            return this;
        }

        public Builder setBodyObject(T bodyObject) {
            this.bodyObject = bodyObject;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSoapAction(SoapAction soapAction) {
            this.soapAction = soapAction;
            return this;
        }

        public Builder setEndpointUrl(EndpointUrl endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        public SOAPMessage call() {
            return callSoapWebService(endpointUrl.getEndpointUrl(), soapAction.getSoapActionValue());
        }

        public static JAXBElement bindToJaxb(Class clazz, SOAPMessage soapResponse) throws XMLStreamException, SOAPException, JAXBException {
            //Unmarshall XML
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(soapResponse.getSOAPPart().getContent());
            xsr.nextTag(); // Advance to Envelope tag
            xsr.nextTag(); // Advance to Body tag
            xsr.nextTag(); // Advance to MatchResponse tag

            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement je = unmarshaller.unmarshal(xsr, clazz);

            return je;
        }

        /**
         * Create connection, send request, get response.
         *
         * @param soapEndpointUrl
         * @param soapAction
         */
        private SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction) {
            SOAPMessage soapResponse = null;
            try {
                SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
                SOAPConnection soapConnection = soapConnectionFactory.createConnection();

                soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

                logger.info("Response SOAP Message:");
                if (soapResponse.getSOAPPart().getEnvelope().getHeader() != null) {
                    soapResponse.getSOAPPart().getEnvelope().getHeader().detachNode();
                }
                soapResponse.writeTo(System.out);

                soapConnection.close();
            } catch (Exception e) {
                logger.error("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
                e.printStackTrace();
            }

            return soapResponse;
        }

        private SOAPMessage createSOAPRequest(String soapAction) throws Exception {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();

            createSoapEnvelope(bodyObject, soapMessage);
            WSPolicyUtil.addWSSEHeader(soapMessage, username, password);

            MimeHeaders headers = soapMessage.getMimeHeaders();
            headers.addHeader("SOAPAction", soapAction);

            soapMessage.saveChanges();

            logger.info("Request SOAP Message:");
            soapMessage.writeTo(System.out);

            return soapMessage;
        }

        private void createSoapEnvelope(T soapObject, SOAPMessage soapMessage) throws SOAPException, ParserConfigurationException, JAXBException {
            SOAPPart soapPart = soapMessage.getSOAPPart();

            // SOAP Envelope
            SOAPEnvelope envelope = soapPart.getEnvelope();
            envelope.addNamespaceDeclaration(NAMESPACE_COM, NAMESPACE_COM_URI);

            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            //Dynamic creating of JAXB Instance
            JAXBContext jaxbContext = JAXBContext.newInstance(requestClass);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter sw = new StringWriter();
            marshaller.marshal(soapObject, sw);
            marshaller.marshal(soapObject, document);

            SOAPBody soapBody = envelope.getBody();
            soapBody.addDocument(document);
        }
    }
}
