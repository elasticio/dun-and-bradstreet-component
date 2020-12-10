package io.elastic.dnb.industry.actions;

import com.dnb.services.industry.OrderProductRequest;
import com.dnb.services.industry.OrderProductResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndustryState implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(IndustryState.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JaxbAnnotationModule());
    mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    GenericSOAPClient.callService(parameters, OrderProductRequest.class,
        OrderProductResponse.class, EndpointUrl.INDUSTRY_PRODUCT,
        SoapAction.INDUSTRY_PRODUCT, mapper);
  }
}
