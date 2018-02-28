package io.elastic.dnb.company.actions;

import com.dnb.services.company.CleanseAndStandardizeRequest;
import com.dnb.services.company.CleanseAndStandardizeResponse;
import com.fasterxml.jackson.databind.*;
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

public class CleanseAndStandardize implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(CleanseAndStandardize.class);

    @Override
    public void execute(ExecutionParameters parameters) {

//    public static void main(String[] args) {


        String bodyString = "{\n" +
                "\t\"cleanseAndStandardizeRequestDetail\": {\n" +
                "\t\t\"inquiryDetail\": {\n" +
                "\t\t    \"organizationName\": \"GORMAN MANUFACTURING COMPANY, INC.\",\n" +
                "\t\t\t\"address\": {\n" +
                "\t\t\t\t\"streetAddressLine\": {\n" +
                "\t\t\t\t\t\"lineText\": \"492 KOLLER STREET\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"primaryTownName\": \"SAN FRANCISCO\",\n" +
                "\t\t\t\t\"countryIsoAlpha2Code\": \"US \",\n" +
                "\t\t\t\t\"countyName\": \"CA\",\n" +
                "\t\t\t\t\"postalCode\": \"94110\"\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"inquiryReferenceDetail\": {\n" +
                "\t\t\t\"customerReferenceText\": [\n" +
                "\t\t\t\t\"EnvironmentMonitoring\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"customerBillingEndorsementText\": \"EnvironmentMonitoring\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";


//        ObjectMapper objectMapper = new ObjectMapper();

//        Reader reader = new StringReader(bodyString);


        JsonObject configuration = parameters.getConfiguration();
        Message data = null;
        JsonObject jsonDataObject = null;

        JsonObject body = parameters.getMessage().getBody();
        logger.info("About to call DnB API. Request message: {}", body.toString());
        ObjectMapper mapper = new ObjectMapper();

//        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        try {
            CleanseAndStandardizeRequest cleanseAndStandardizeRequest = mapper.readValue(body.toString(), CleanseAndStandardizeRequest.class);
//            CleanseAndStandardizeRequest cleanseAndStandardizeRequest = mapper.readValue(bodyString, CleanseAndStandardizeRequest.class);

            SOAPMessage response = new GenericSOAPClient.Builder()
                    .setRequestClass(CleanseAndStandardizeRequest.class)
                    .setBodyObject(cleanseAndStandardizeRequest)
                    .setEndpointUrl(EndpointUrl.COMPANY_5_0)
                    .setSoapAction(SoapAction.CLEANSE_AND_STANDARDIZE_MATCH)
//                    .setUsername("P2000000C49DC06FDA0481EAD1AE30A9")
                    .setUsername(Utils.getUsername(configuration))
                    .setPassword(Utils.getPassword(configuration))
//                    .setPassword("tcyt9ucg")
                    .call();

            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(CleanseAndStandardizeResponse.class, response);
            CleanseAndStandardizeResponse cleanseAndStandardizeResponse = (CleanseAndStandardizeResponse) jaxbElement.getValue();

            ObjectMapper responseMapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            responseMapper.writeValue(sw, cleanseAndStandardizeResponse);
            jsonDataObject = JSON.parseObject(sw.toString());

            data = new Message.Builder().body(jsonDataObject).build();

        } catch (JAXBException e) {
            throw new ClassCastException("Can't map JSON object to MatchRequest XML");
        } catch (IOException | XMLStreamException | SOAPException e) {
            e.printStackTrace();
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

//{"cleanseAndStandardizeRequestDetail":{"inquiryReferenceDetail":{"customerBillingEndorsementText":"EnvironmentMonitoring","customerReferenceText":["EnvironmentMonitoring"},"inquiryDetail":{"address":{"streetAddressLine":{"lineText":"492 KOLLER STREET"}},"organizationName":"GORMAN MANUFACTURING COMPANY, INC."}},"transactionDetail":{"applicationTransactionId":"EnvironmentMonitoring"}}