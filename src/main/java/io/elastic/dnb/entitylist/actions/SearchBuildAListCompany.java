package io.elastic.dnb.entitylist.actions;

import com.dnb.services.entitylist.FindCompanyRequest;
import com.dnb.services.entitylist.FindCompanyResponse;
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

public class SearchBuildAListCompany implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(SearchBuildAListCompany.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    GenericSOAPClient.callService(parameters, FindCompanyRequest.class,
        FindCompanyResponse.class, EndpointUrl.ENTITY_LIST_6_4,
        SoapAction.FIND_COMPANY, Utils.getConfiguredObjectMapper());
  }
}
