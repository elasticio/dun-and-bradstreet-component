package io.elastic.dnb;

import io.elastic.api.InvalidCredentialsException;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import org.junit.BeforeClass;
import org.junit.Test;

public class DnBCredentialsVerifierTest {

  private static JsonObject config;

  @BeforeClass
  public static void initTest() {
    config = Json.createObjectBuilder()
        .add("accountName", "My Dun and Bradstreet credentials")
        .add("username", "")
        .add("password", "")
        .build();
  }

  @Test(expected = InvalidCredentialsException.class)
  public void throwExceptionIfEmptyCredentials() throws InvalidCredentialsException {
    DnBCredentialsVerifier verifier = new DnBCredentialsVerifier();
    verifier.verify(config);
  }
}
