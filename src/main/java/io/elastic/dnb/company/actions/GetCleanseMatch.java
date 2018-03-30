package io.elastic.dnb.company.actions;

import com.dnb.services.company.GetCleanseMatchRequest;
import com.dnb.services.company.GetCleanseMatchResponse;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.JSON;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.Utils;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.io.StringWriter;

public class GetCleanseMatch{//} implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(GetCleanseMatch.class);

//    @SuppressWarnings("Duplicates")
//    @Override
//    public void execute(final ExecutionParameters parameters) {
public static void main(String[] args) throws IOException {


//        JsonObject configuration = parameters.getConfiguration();
        Message data;
        JsonObject jsonDataObject;

        String bodyString = "{\n"
            + " \"getCleanseMatchRequestDetail\": {\n"
            + "    \"inquiryDetail\": {\n"
            + "      \"dunsNumber\": \"804735132\",\n"
            + "      \"subjectName\": \"Gorman Corporation\",\n"
            + "      \"telephoneNumber\": {\n"
            + "        \"telecommunicationNumber\": \"984562123\"\n"
            + "      },\n"
            + "      \"organizationIdentificationNumberDetail\": \"789654123\"\n"
            + "    }\n"
            + "  }\n"
            + "}";


//        JsonObject body = parameters.getMessage().getBody();
//        logger.info("About to call DnB API. Request message: {}", body.toString());
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
//        JsonObject body = mapper.readValue(bodyString, GetCleanseMatchRequest.class);
        try {
//            GetCleanseMatchRequest getCleanseMatchRequest = mapper.readValue(body.toString(), GetCleanseMatchRequest.class);
            GetCleanseMatchRequest getCleanseMatchRequest = mapper.readValue(bodyString, GetCleanseMatchRequest.class);

            SOAPMessage response = new GenericSOAPClient.Builder()
                    .setRequestClass(GetCleanseMatchRequest.class)
                    .setBodyObject(getCleanseMatchRequest)
                    .setEndpointUrl(EndpointUrl.COMPANY_5_0)
                    .setSoapAction(SoapAction.GET_CLEANSE_MATCH)
//                    .setUsername(Utils.getUsername(configuration))
                    .setUsername("P2000000C49DC06FDA0481EAD1AE30A9")
//                    .setPassword(Utils.getPassword(configuration))
                    .setPassword("tcyt9ucg")
                    .call();

            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(GetCleanseMatchResponse.class, response);
            GetCleanseMatchResponse getCleanseMatchResponse = (GetCleanseMatchResponse) jaxbElement.getValue();

            ObjectMapper responseMapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            responseMapper.writeValue(sw, getCleanseMatchResponse);
            jsonDataObject = JSON.parseObject(sw.toString());

      System.out.println(jsonDataObject.toString());

            data = new Message.Builder().body(jsonDataObject).build();

        } catch (JAXBException e) {
            logger.error("Oops!", e);
            throw new ClassCastException("Can't map JSON object to MatchRequest XML");
        } catch (IOException | XMLStreamException | SOAPException e) {
            logger.error("Oops!", e);
            data = (new Message.Builder())
                    .body(Json.createObjectBuilder()
                            .add("result", e.getMessage())
                            .build())
                    .build();
//            parameters.getEventEmitter().emitException(e);
        }

//        parameters.getEventEmitter().emitData(data);

    }

}
