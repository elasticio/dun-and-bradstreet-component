package io.elastic.dnb.rest.client;

import javax.json.JsonObject;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        //https://direct.dnb.com/V2.2/organizations/804735132/products?CountryISOAlpha2Code=US
        JsonObject response = null;
        try {
            response = new GenericRESTClient.Builder()
                    .setAccept(MediaType.APPLICATION_JSON)
//                    .setBaseUri("https://direct.dnb.com/V2.2/organizations/804735132/products?CountryISOAlpha2Code=US")
                    .setBaseUri(BaseUri.PRODUCTS.getBaseUriValue())
                    .setHttpMethod(HttpMethod.GET)
                    .setUsername("P200000E291E8762A114FBF95791A2BE")
                    .setPassword("tcyt9ucg")
                    .call();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("response:" + response.toString());
    }
}
