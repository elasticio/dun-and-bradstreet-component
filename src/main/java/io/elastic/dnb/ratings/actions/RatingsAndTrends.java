package io.elastic.dnb.ratings.actions;

import com.dnb.services.ratings.actions.OrderProductRequest;
import com.dnb.services.ratings.actions.OrderProductResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
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

public class RatingsAndTrends implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(RatingsAndTrends.class);

    @SuppressWarnings("Duplicates")
    @Override
    public void execute(ExecutionParameters parameters) {

        logger.info("_______________" + parameters.toString());
        JsonObject configuration = parameters.getConfiguration();
        Message data = null;
        JsonObject jsonDataObject = null;

        JsonObject body = parameters.getMessage().getBody();
        logger.info("About to call DnB API. Request message: {}", body.toString());
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        try {
            OrderProductRequest orderProductRequest = mapper.readValue(body.toString(), OrderProductRequest.class);
            logger.info(orderProductRequest.getOrderProductRequestDetail().getProductSpecification().getDNBProductID();
            orderProductRequest.getOrderProductRequestDetail().getProductSpecification().setDNBProductID("RTNG_TRND");
            logger.info(orderProductRequest.getOrderProductRequestDetail().getProductSpecification().getDNBProductID());

            SOAPMessage response = new GenericSOAPClient.Builder()
                    .setRequestClass(OrderProductRequest.class)
                    .setBodyObject(orderProductRequest)
                    .setEndpointUrl(EndpointUrl.RATINGS)
                    .setSoapAction(SoapAction.RATINGS)
                    .setUsername(Utils.getUsername(configuration))
                    .setPassword(Utils.getPassword(configuration))
                    .call();

            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(OrderProductResponse.class, response);
            OrderProductResponse orderProductResponse = (OrderProductResponse) jaxbElement.getValue();

            ObjectMapper responseMapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            responseMapper.writeValue(sw, orderProductResponse);
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
