package io.elastic.dnb.company.actions;

import com.dnb.services.company.CleanseAndStandardizeRequest;
import com.dnb.services.company.CleanseAndStandardizeResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CleanseAndStandardize implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(CleanseAndStandardize.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

    GenericSOAPClient.callService(parameters, CleanseAndStandardizeRequest.class,
        CleanseAndStandardizeResponse.class, EndpointUrl.COMPANY_5_0,
        SoapAction.CLEANSE_AND_STANDARDIZE_MATCH, mapper);
  }
}
