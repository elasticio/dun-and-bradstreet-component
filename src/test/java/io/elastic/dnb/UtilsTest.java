package io.elastic.dnb;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.json.Json;
import javax.json.JsonObject;

public class UtilsTest {

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

    @Test
    public void getPassword() {
        assertTrue(Utils.getPassword(config).length() > 0);
    }

}