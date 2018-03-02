package io.elastic.dnb.soap.client;

public enum EndpointUrl {

    COMPANY_5_0("https://direct.dnb.com/Company/V5.0"),
    CONTACT_PRODUCT("https://direct.dnb.com/ContactProduct/V4.0"),
    ENTITY_LIST_6_4("https://direct.dnb.com/EntityList/V6.4"),
    NEWS_AND_MEDIA_PRODUCT_3_0("https://direct.dnb.com/NewsAndMediaProduct/V3.0"),
    RATINGS("https://direct.dnb.com/AssessmentProduct/V5.0"),
    REPORT_PRODUCT("https://direct.dnb.com/ReportProduct/V3.2");

    private String endpointUrl;

    EndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public String getEndpointUrl() {
        return this.endpointUrl;
    }
}
