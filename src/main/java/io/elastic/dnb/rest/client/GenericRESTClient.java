package io.elastic.dnb.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import javax.ws.rs.HttpMethod;

public class GenericRESTClient {

    protected static final Logger logger = LoggerFactory.getLogger(GenericRESTClient.class);

    public static class Builder {

        private static String username;
        private static String password;

        private static String baseUri;
        private static String baseAuthUri;
        private static String authToken;
        private static String accept;
        private static String httpMethod;
        private static String authHttpMethod;

        private static String target;
        private static String targetValue;

        private static Map<String, String> mapParameters;

        private static HttpURLConnection conn;

        //Main method to call REST service
        public static JsonObject call() throws NullPointerException, IOException, InterruptedException {

            //Check if all the fields are fulfilled
            checkFieldForNull();

            //First we need to get authToken by username and password
            //https://docs.dnb.com/direct/2.0/en-US/authentication/latest/rest-API
            getAuthToken();

            //Get HTTP connection
            return buildJsonObject(getConnection());
        }

        //Separate call just to get Auth Token
        private static String authCall() throws NullPointerException, IOException {

            String authToken = getAuthConnection();

            //Get String from json
            return buildJsonObject(authToken)
                    .getJsonObject("AuthenticationDetail")
                    .getString("Token");
        }

        public Builder addParameters(String key, String value) {
            mapParameters.put(key, value);
            return this;
        }

        public Builder appendPath(String path) {
            baseUri += (path + "/");
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setBaseUri(String baseUri) {
            this.baseUri = baseUri;
            return this;
        }

        public Builder setBaseAuthUri(String baseAuthUri) {
            this.baseAuthUri = baseAuthUri;
            return this;
        }

        public Builder setAccept(String accept) {
            this.accept = accept;
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder setAuthHttpMethod(String authHttpMethod) {
            this.authHttpMethod = authHttpMethod;
            return this;
        }

        public Builder setTarget(String target, String targetValue) {
            this.target = target;
            this.targetValue = targetValue;
            return this;
        }

        private static void checkFieldForNull() throws NullPointerException {

            if (username == null
                    || password == null
                    || baseUri == null
                    || httpMethod == null) {
                throw new NullPointerException("Fields can not be null");
            }
        }

        //Call just to get auth token
        private static String getAuthConnection() throws IOException {
            URL url = new URL(baseAuthUri);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(authHttpMethod);
            conn.setRequestProperty("x-dnb-user", username);
            conn.setRequestProperty("x-dnb-pwd", password);

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            StringBuilder sb = new StringBuilder();
            String output;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())))) {

                while ((output = br.readLine()) != null) {
                    sb.append(output);
                }
            }

            conn.disconnect();

            return sb.toString();
        }

        private static void getAuthToken() throws IOException {

            authToken = new GenericRESTClient.Builder()
                    .setBaseAuthUri(BaseUri.BASE_AUTH_URI.getBaseUriValue())
                    .setAuthHttpMethod(HttpMethod.POST)
                    .setUsername(username)
                    .setPassword(password)
                    .authCall();

            logger.debug("Got auth token from the D&B Server");
        }

        //Main Connection
        private static String getConnection() throws IOException, InterruptedException {

            URL url = new URL(baseUri + "person?" + target + "=" + targetValue);

            logger.debug("About to open connection to the URL");

            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(httpMethod);
            conn.setRequestProperty("Accept", accept);
            conn.setRequestProperty("authorization", authToken);

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            StringBuilder sb = new StringBuilder();
            String output;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())))) {

                while ((output = br.readLine()) != null) {
                    sb.append(output);
                }
            }

            conn.disconnect();

            return sb.toString();
        }

        /**
         * Method to get JsonObject from String
         * @param jsonString
         * @return
         */
        private static JsonObject buildJsonObject(String jsonString) {

            JsonReader jsonReader = Json.createReader(new StringReader(jsonString));
            JsonObject jsonObject = jsonReader.readObject();
            jsonReader.close();

            return jsonObject;
        }
    }
}
