package io.elastic.dnb.report.actions;

import com.dnb.services.report.OrderCompanyReportRequest;
import com.dnb.services.report.OrderCompanyReportResponse;
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

public class CompactReport implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(CompactReport.class);

  @SuppressWarnings("Duplicates")
  @Override
  public void execute(final ExecutionParameters parameters) {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

    GenericSOAPClient.callService(parameters, OrderCompanyReportRequest.class,
        OrderCompanyReportResponse.class, EndpointUrl.REPORT_PRODUCT,
        SoapAction.REPORT_PRODUCT, mapper);
  }
}
