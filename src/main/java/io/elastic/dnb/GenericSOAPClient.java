package io.elastic.dnb;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.JSON;
import io.elastic.api.Message;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import io.elastic.dnb.soap.client.WSPolicyUtil;
import java.io.IOException;
import java.io.StringWriter;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

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

    public Builder setRequestClass(final Class requestClass) {
      this.requestClass = requestClass;
      return this;
    }

    public Builder setBodyObject(final T bodyObject) {
      this.bodyObject = bodyObject;
      return this;
    }

    public Builder setUsername(final String username) {
      this.username = username;
      return this;
    }

    public Builder setPassword(final String password) {
      this.password = password;
      return this;
    }

    public Builder setSoapAction(final SoapAction soapAction) {
      this.soapAction = soapAction;
      return this;
    }

    public Builder setEndpointUrl(final EndpointUrl endpointUrl) {
      this.endpointUrl = endpointUrl;
      return this;
    }

    public SOAPMessage call() {
      return callSoapWebService(endpointUrl.getEndpointUrl(), soapAction.getSoapActionValue());
    }

    public static JAXBElement bindToJaxb(final Class clazz, final SOAPMessage soapResponse)
        throws XMLStreamException, SOAPException, JAXBException {
      //Unmarshall XML
      XMLInputFactory xif = XMLInputFactory.newFactory();
      XMLStreamReader xsr = xif.createXMLStreamReader(soapResponse.getSOAPPart().getContent());
      xsr.nextTag(); // Advance to Envelope tag
      xsr.nextTag(); // Advance to Body tag
      xsr.nextTag(); // Advance to MatchResponse tag

      JAXBContext jc = JAXBContext.newInstance(clazz);
      Unmarshaller unmarshaller = jc.createUnmarshaller();

      return unmarshaller.unmarshal(xsr, clazz);
    }

    /**
     * Create connection, send request, get response.
     */
    private SOAPMessage callSoapWebService(final String soapEndpointUrl, final String soapAction) {
      SOAPMessage soapResponse = null;
      try {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

        if (soapResponse.getSOAPPart().getEnvelope().getHeader() != null) {
          soapResponse.getSOAPPart().getEnvelope().getHeader().detachNode();
        }

        soapConnection.close();
      } catch (Exception e) {
        logger.error(
            "\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
      }

      return soapResponse;
    }

    private SOAPMessage createSOAPRequest(final String soapAction) throws Exception {
      MessageFactory messageFactory = MessageFactory.newInstance();
      SOAPMessage soapMessage = messageFactory.createMessage();

      createSoapEnvelope(bodyObject, soapMessage);
      WSPolicyUtil.addWSSEHeader(soapMessage, username, password);

      MimeHeaders headers = soapMessage.getMimeHeaders();
      headers.addHeader("SOAPAction", soapAction);

      soapMessage.saveChanges();

      return soapMessage;
    }

    private void createSoapEnvelope(final T soapObject, final SOAPMessage soapMessage)
        throws SOAPException, ParserConfigurationException, JAXBException {
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

  public static <T, U> void callService(ExecutionParameters parameters, Class<T> clazzRequest,
      Class<U> clazzResponse, EndpointUrl endpointUrl, SoapAction soapAction, ObjectMapper mapper) {
    JsonObject configuration = parameters.getConfiguration();
    Message data;
    JsonObject jsonDataObject;

    String bodyString = parameters.getMessage().getBody().toString();
    logger.info("About to call DnB API with the request message");

    try {
      Object objectRequest = mapper.readValue(bodyString, clazzRequest);
      T request = clazzRequest.cast(objectRequest);

      SOAPMessage response = new GenericSOAPClient.Builder()
          .setRequestClass(clazzRequest)
          .setBodyObject(request)
          .setEndpointUrl(endpointUrl)
          .setSoapAction(soapAction)
          .setUsername(Utils.getUsername(configuration))
          .setPassword(Utils.getPassword(configuration))
          .call();

      JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(clazzResponse, response);
      Object objectResponse = jaxbElement.getValue();
      U responseCasted = clazzResponse.cast(objectResponse);

      ObjectMapper responseMapper = new ObjectMapper();
      StringWriter sw = new StringWriter();
      responseMapper.writeValue(sw, responseCasted);
      jsonDataObject = JSON.parseObject(sw.toString());

      data = new Message.Builder().body(jsonDataObject).build();

    } catch (JAXBException e) {
      logger.error("Can't map JSON object to MatchRequest XML");
      throw new ClassCastException("Can't map JSON object to MatchRequest XML");
    } catch (IOException | XMLStreamException | SOAPException e) {
      logger.error(
          "Oops! There was an error trying to call the SOAP API. See the emitted error message for the details");
      data = (new Message.Builder())
          .body(Json.createObjectBuilder()
              .add("result", e.getMessage())
              .build())
          .build();
      parameters.getEventEmitter().emitException(e);
    }

    parameters.getEventEmitter().emitData(data);
  }
}
