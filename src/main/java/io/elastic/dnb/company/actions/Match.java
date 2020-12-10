package io.elastic.dnb.company.actions;

import com.dnb.services.company.MatchRequest;
import com.dnb.services.company.MatchResponse;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Match implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(Match.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    GenericSOAPClient.callService(parameters, MatchRequest.class,
        MatchResponse.class, EndpointUrl.COMPANY_5_0,
        SoapAction.MATCH, mapper);
  }
}
