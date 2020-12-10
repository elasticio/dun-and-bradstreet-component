package io.elastic.dnb.entitylist.actions;

import com.dnb.services.entitylist.FindCompetitorRequest;
import com.dnb.services.entitylist.FindCompetitorResponse;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindCompetitor implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(FindCompetitor.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    GenericSOAPClient.callService(parameters, FindCompetitorRequest.class,
        FindCompetitorResponse.class, EndpointUrl.ENTITY_LIST_6_4,
        SoapAction.FIND_COMPETITOR, mapper);
  }
}
