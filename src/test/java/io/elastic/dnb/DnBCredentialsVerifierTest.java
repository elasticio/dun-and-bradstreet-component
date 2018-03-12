package io.elastic.dnb;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;

import static org.junit.Assert.assertTrue;

public class DnBCredentialsVerifierTest {

    private static JsonObject config;

    @BeforeClass
    public static void initTest() {
        config = Json.createObjectBuilder()
                .add(AppConstants.USERNAME_CONFIG_NAME, "test-username")
                .add(AppConstants.PASSWORD_CONFIG_NAME, "test-password")
                .build();
    }

    @Test
    public void getUsername() {
        assertTrue(Utils.getUsername(config).length() > 0);
    }
}
