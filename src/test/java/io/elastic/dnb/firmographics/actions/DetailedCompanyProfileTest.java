package io.elastic.dnb.firmographics.actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dnb.services.company.GetCleanseMatchRequest;
import com.dnb.services.firmorgaphics.OrderProductRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.elastic.dnb.Utils;
import java.util.ArrayList;
import org.junit.Test;

public class DetailedCompanyProfileTest {

  String jsonBody = ""
      + "{\n"
      + "  \"orderProductRequestDetail\": {\n"
      + "    \"inquiryDetail\": {\n"
      + "      \"dunsNumber\": \"804735132\"\n"
      + "    },\n"
      + "    \"productSpecification\": {\n"
      + "      \"dnbProductId\": \"DCP_PREM\"\n"
      + "    }\n"
      + "  }\n"
      + "}";

  @Test
  public void deserializeJsonToObject() throws JsonProcessingException {
    OrderProductRequest orderProductRequest = Utils.getConfiguredObjectMapper()
        .readValue(jsonBody, OrderProductRequest.class);
    assertTrue(orderProductRequest != null);
    assertEquals(orderProductRequest.getOrderProductRequestDetail().getInquiryDetail()
        .getDUNSNumber(), "804735132");
    assertEquals(orderProductRequest.getOrderProductRequestDetail().getProductSpecification()
        .getDNBProductID(), "DCP_PREM");
  }

}
