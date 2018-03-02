package io.elastic.dnb.rest.client;

public enum BaseUri {

    BASE_AUTH_URI("https://direct.dnb.com/Authentication/V2.0/"),
    SOCIAL_MEDIA_PROFILES("https://direct.dnb.com/dataexchange/");
//    PRODUCTS("https://direct.dnb.com/V2.2/organizations/804735132/products?CountryISOAlpha2Code=US");

    private String baseUriValue;

    public String getBaseUriValue() {
        return this.baseUriValue;
    }

    BaseUri(String baseUriValue) {
        this.baseUriValue = baseUriValue;
    }
}
