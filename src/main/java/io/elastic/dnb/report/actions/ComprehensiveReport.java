package io.elastic.dnb.report.actions;

import com.dnb.services.report.OrderCompanyReportRequest;
import com.dnb.services.report.OrderCompanyReportResponse;
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

public class ComprehensiveReport implements Function {

  protected static final Logger logger = LoggerFactory.getLogger(ComprehensiveReport.class);

  @SuppressWarnings("Duplicates")
  @Override
  public void execute(final ExecutionParameters parameters) {

    GenericSOAPClient.callService(parameters, OrderCompanyReportRequest.class,
        OrderCompanyReportResponse.class, EndpointUrl.REPORT_PRODUCT,
        SoapAction.REPORT_PRODUCT, Utils.getConfiguredObjectMapper());
  }
}
