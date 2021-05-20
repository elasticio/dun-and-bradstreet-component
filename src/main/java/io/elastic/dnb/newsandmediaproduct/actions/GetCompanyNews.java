package io.elastic.dnb.newsandmediaproduct.actions;

import com.dnb.services.newsandmediaproduct.OrderProductRequest;
import com.dnb.services.newsandmediaproduct.OrderProductResponse;
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

public class GetCompanyNews implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(GetCompanyNews.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    GenericSOAPClient.callService(parameters, OrderProductRequest.class,
        OrderProductResponse.class, EndpointUrl.NEWS_AND_MEDIA_PRODUCT_3_0,
        SoapAction.NEWS_AND_MEDIA_PRODUCT, Utils.getConfiguredObjectMapper());
  }
}
