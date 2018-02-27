package io.elastic.dnb.soap.client;

public enum SoapAction {

    MATCH("http://services.dnb.com/CompanyService/V5.0/Match"),
    GET_CLEANSE_MATCH("http://services.dnb.com/CompanyService/V5.0/GetCleanseMatch"),
    CLEANSE_AND_STANDARDIZE_MATCH("http://services.dnb.com/CompanyService/V5.0/CleanseAndStandardize"),
    NEWS_AND_MEDIA_PRODUCT("http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct"),
    FIND_COMPETITOR("http://services.dnb.com/EntityListService/V6.4/FindCompetitor");

    private String soapActionValue;

    public String getSoapActionValue() {
        return this.soapActionValue;
    }

    SoapAction(String soapActionValue) {
        this.soapActionValue = soapActionValue;
    }
}
