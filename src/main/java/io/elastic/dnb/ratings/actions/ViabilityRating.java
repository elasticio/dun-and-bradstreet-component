package io.elastic.dnb.ratings.actions;

import com.dnb.services.ratings.actions.OrderProductRequest;
import com.dnb.services.ratings.actions.OrderProductResponse;
import com.dnb.services.ratings.actions.ProductSpecification;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.api.JSON;
import io.elastic.api.Message;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.Utils;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import java.io.IOException;
import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViabilityRating implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(ViabilityRating.class);

  private static final String DNBPRODUCTID = "VIAB_RAT";

  @SuppressWarnings("Duplicates")
  @Override
  public void execute(final ExecutionParameters parameters) {

    JsonObject configuration = parameters.getConfiguration();
    Message data;
    JsonObject jsonDataObject;

    JsonObject body = parameters.getMessage().getBody();
    logger.info("About to call DnB API with the request message");
    ObjectMapper mapper = new ObjectMapper();

    mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    try {
      OrderProductRequest orderProductRequest = mapper
          .readValue(body.toString(), OrderProductRequest.class);

      //DNBProductID MUST be equal to VIAB_RAT
      ProductSpecification productSpecification;

      if (orderProductRequest.getOrderProductRequestDetail().getProductSpecification() == null) {
        productSpecification = new ProductSpecification();
      } else {
        productSpecification = orderProductRequest.getOrderProductRequestDetail()
            .getProductSpecification();
      }
      productSpecification.setDNBProductID(DNBPRODUCTID);
      orderProductRequest.getOrderProductRequestDetail()
          .setProductSpecification(productSpecification);

      SOAPMessage response = new GenericSOAPClient.Builder()
          .setRequestClass(OrderProductRequest.class)
          .setBodyObject(orderProductRequest)
          .setEndpointUrl(EndpointUrl.RATINGS)
          .setSoapAction(SoapAction.RATINGS)
          .setUsername(Utils.getUsername(configuration))
          .setPassword(Utils.getPassword(configuration))
          .call();

      JAXBElement jaxbElement = new GenericSOAPClient.Builder()
          .bindToJaxb(OrderProductResponse.class, response);
      OrderProductResponse orderProductResponse = (OrderProductResponse) jaxbElement.getValue();

      ObjectMapper responseMapper = new ObjectMapper();
      StringWriter sw = new StringWriter();
      responseMapper.writeValue(sw, orderProductResponse);
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
