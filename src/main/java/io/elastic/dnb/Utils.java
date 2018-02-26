package io.elastic.dnb;

import javax.json.JsonObject;
import javax.json.JsonString;

public class Utils {

    public static final String getConfigParam(final JsonObject config, final String key) {
        final JsonString value = config.getJsonString(key);

        if (value == null) {
            throw new IllegalStateException(String.format("Config parameter '%s' is required", key));
        }

        return value.getString();
    }

    public static String getUsername(final JsonObject config) {
        return Utils.getConfigParam(config, AppConstants.USERNAME_CONFIG_NAME);
    }

    public static String getPassword(final JsonObject config) {
        return Utils.getConfigParam(config, AppConstants.PASSWORD_CONFIG_NAME);
    }


}
