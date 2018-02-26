package io.elastic.dnb.match.actions;

import com.dnb.services.match.*;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Module;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.Utils;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.JsonObject;
import javax.xml.bind.*;
import javax.xml.soap.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.StringWriter;

public class Match implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(Match.class);

    @Override
    public void execute(ExecutionParameters parameters) {


        //Парсится норм. Дописать парсинг ответа и emitData


        JsonObject configuration = parameters.getConfiguration();


        JsonObject body = parameters.getMessage().getBody();
        logger.info(":::::" + body.toString());
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        try {
            MatchRequest matchRequest = mapper.readValue(body.toString(), MatchRequest.class);
            logger.info("))))))))" + matchRequest.getMatchRequestDetail().getInquiryDetail().getSubjectName());


            SOAPMessage response = new GenericSOAPClient.Builder()
                    .setBodyObject(matchRequest)
                    .setEndpointUrl(EndpointUrl.V5)
                    .setSoapAction(SoapAction.MATCH)
                    .setUsername(Utils.getUsername(configuration))
                    .setPassword(Utils.getPassword(configuration))
                    .call();

            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(MatchResponse.class, response);
            MatchResponse matchResponse = (MatchResponse) jaxbElement.getValue();
            ObjectMapper responseMapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            responseMapper.writeValue(sw, matchResponse);
            logger.info("===============" + sw);


        } catch (IOException e) {

        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            throw new ClassCastException("Can't map JSON object to MatchRequest XML");
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

//        final JsonObject body = Json.createObjectBuilder()
//                .add(FeedSubmissionUtils.FEED_SUBMISSION_ID, feedSubmissionId)
//                .build();
//
//        parameters.getEventEmitter().emitData(new Message.Builder(body).build());

    }

    public static void main(String[] args) {

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
