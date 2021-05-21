package io.elastic.dnb.company.actions;

import static org.junit.Assert.*;

import com.dnb.services.company.GetCleanseMatchRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.elastic.dnb.Utils;
import java.util.ArrayList;
import org.junit.Test;

public class GetCleansMatchTest {

  String jsonBody = ""
      + "{\n"
      + "  \"getCleanseMatchRequestDetail\": {\n"
      + "    \"inquiryDetail\": {\n"
      + "      \"dunsNumber\": \"23432\",\n"
      + "      \"address\": {\n"
      + "        \"countryIsoAlpha2Code\": \"US\",\n"
      + "        \"fullPostalCode\": \"00333\",\n"
      + "        \"streetAddressLine\": {\n"
      + "          \"lineText\": \"abc\"\n"
      + "        }\n"
      + "      }\n"
      + "    }\n"
      + "  }\n"
      + "}";

  @Test
  public void deserializeJsonToObject() throws JsonProcessingException {
    GetCleanseMatchRequest cleanseMatchRequest = Utils.getConfiguredObjectMapper()
        .readValue(jsonBody, GetCleanseMatchRequest.class);
    assertTrue(cleanseMatchRequest != null);
    assertTrue(cleanseMatchRequest.getGetCleanseMatchRequestDetail().getInquiryDetail()
        .getAddress().getStreetAddressLine() instanceof ArrayList);
    assertEquals(cleanseMatchRequest.getGetCleanseMatchRequestDetail().getInquiryDetail()
        .getDUNSNumber(), "23432");
    assertEquals(cleanseMatchRequest.getGetCleanseMatchRequestDetail().getInquiryDetail()
        .getAddress().getStreetAddressLine().size(), 1);
  }

}
