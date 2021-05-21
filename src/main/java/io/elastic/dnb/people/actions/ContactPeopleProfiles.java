package io.elastic.dnb.people.actions;

import com.dnb.services.contact.OrderProductRequest;
import com.dnb.services.contact.OrderProductResponse;
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

public class ContactPeopleProfiles implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(ContactPeopleProfiles.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    GenericSOAPClient.callService(parameters, OrderProductRequest.class,
        OrderProductResponse.class, EndpointUrl.CONTACT_PRODUCT,
        SoapAction.CONTACT_PRODUCT, Utils.getConfiguredObjectMapper());
  }
}
