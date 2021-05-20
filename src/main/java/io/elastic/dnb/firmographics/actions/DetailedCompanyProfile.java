package io.elastic.dnb.firmographics.actions;

import com.dnb.services.firmorgaphics.OrderProductRequest;
import com.dnb.services.firmorgaphics.OrderProductResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.Utils;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DetailedCompanyProfile implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(DetailedCompanyProfile.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    GenericSOAPClient.callService(parameters, OrderProductRequest.class,
        OrderProductResponse.class, EndpointUrl.FIRMOGRAPHICS,
        SoapAction.FIRMOGRAPHICS, Utils.getConfiguredObjectMapper());
  }
}
