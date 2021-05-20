package io.elastic.dnb.report.actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dnb.services.company.GetCleanseMatchRequest;
import com.dnb.services.report.OrderCompanyReportRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.elastic.dnb.Utils;
import java.util.ArrayList;
import org.junit.Test;

public class BusinessBackgroundReportsTest {

  String jsonBody = ""
      + "{\n"
      + "  \"orderCompanyReportRequestDetail\": {\n"
      + "    \"inquiryDetail\": {\n"
      + "      \"dunsNumber\": \"804735132\"\n"
      + "    },\n"
      + "    \"productSpecification\": {\n"
      + "      \"dnbProductId\": \"BBR\"\n"
      + "    }\n"
      + "  }\n"
      + "}";

  @Test
  public void deserializeJsonToObject() throws JsonProcessingException {
    OrderCompanyReportRequest orderCompanyReportRequest = Utils.getConfiguredObjectMapper()
        .readValue(jsonBody, OrderCompanyReportRequest.class);
    assertTrue(orderCompanyReportRequest != null);
    assertEquals(orderCompanyReportRequest.getOrderCompanyReportRequestDetail().getInquiryDetail()
        .getDUNSNumber(), "804735132");
    assertEquals(orderCompanyReportRequest.getOrderCompanyReportRequestDetail().getProductSpecification()
        .getDNBProductID(), "BBR");
  }

}
