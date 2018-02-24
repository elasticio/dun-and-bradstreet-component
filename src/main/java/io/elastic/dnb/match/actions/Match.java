package io.elastic.dnb.match.actions;

import com.dnb.services.match.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Module;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.JsonObject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;

public class Match implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(Match.class);

    @Override
    public void execute(ExecutionParameters parameters) {
        JsonObject body = parameters.getMessage().getBody();
        logger.info(":::::" + body.toString());
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue(body.toString(), MatchRequest.class);
        } catch (IOException e) {
            throw new ClassCastException("Can't map JSON object to MatchRequest XML");
        }

    }

    public static void main(String[] args) throws SOAPException, JAXBException, XMLStreamException {
        SOAPMessage soapResponse = new GenericSOAPClient.Builder()
                .setLogin("P2000000C49DC06FDA0481EAD1AE30A9")
                .setPassword("tcyt9ucg")
                .setSoapAction(SoapAction.MATCH)
                .setBodyObject(buildMatchRequest())
                .setEndpointUrl(EndpointUrl.V5)
                .call();

//        logger.info(soapResponse.getSOAPPart().getEnvelope().getBody().getFirstChild().getTextContent());
        logger.info(soapResponse.getSOAPBody().getElementsByTagName("ServiceTransactionID").item(0).getTextContent());
        bindToJaxb(soapResponse);


    }

    private static void bindToJaxb(SOAPMessage soapResponse) throws XMLStreamException, SOAPException, JAXBException {
        //Unmarshall XML and bind to JAXB:
        XMLInputFactory xif = XMLInputFactory.newFactory();
        XMLStreamReader xsr = xif.createXMLStreamReader(soapResponse.getSOAPPart().getContent());
        xsr.nextTag(); // Advance to Envelope tag
        xsr.nextTag(); // Advance to Body tag
        xsr.nextTag(); // Advance to getNumberResponse tag
        System.out.println(xsr.getNamespaceContext().getNamespaceURI("com"));

        JAXBContext jc = JAXBContext.newInstance(MatchResponse.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<MatchResponse> je = unmarshaller.unmarshal(xsr, MatchResponse.class);
        System.out.println(je.getValue());
        MatchResponse matchResponse = je.getValue();
        System.out.println(matchResponse.getMatchResponseDetail().getMatchDataCriteriaText().getValue());
    }

    private static MatchRequest buildMatchRequest() {
        MatchRequest matchRequest = new MatchRequest();
        MatchRequestDetail matchRequestDetail = new MatchRequestDetail();
        InquiryDetail inquiryDetail = new InquiryDetail();
        inquiryDetail.setDUNSNumber("804735132");
        matchRequestDetail.setInquiryDetail(inquiryDetail);
        matchRequest.setMatchRequestDetail(matchRequestDetail);

        MatchSpecification matchSpecification = new MatchSpecification();
        matchSpecification.setMatchTypeText(MatchModeEnum.BASIC);
        matchRequestDetail.setMatchSpecification(matchSpecification);

        return matchRequest;
    }
}
