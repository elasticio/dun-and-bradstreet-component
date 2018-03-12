package io.elastic.dnb.rest.client;

public enum BaseUri {

    BASE_AUTH_URI("https://direct.dnb.com/Authentication/V2.0/"),
    SOCIAL_MEDIA_PROFILES("https://direct.dnb.com/dataexchange/");

    private String baseUriValue;

    public String getBaseUriValue() {
        return this.baseUriValue;
    }

    BaseUri(final String baseUriValue) {
        this.baseUriValue = baseUriValue;
    }
}
