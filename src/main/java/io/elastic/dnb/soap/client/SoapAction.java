package io.elastic.dnb.soap.client;

public enum SoapAction {

    MATCH("http://services.dnb.com/CompanyService/V5.0/Match"),
    FIND_COMPETITOR("http://services.dnb.com/EntityListService/V6.4/FindCompetitor");

    private String soapActionValue;

    public String getSoapActionValue() {
        return this.soapActionValue;
    }

    SoapAction(String soapActionValue) {
        this.soapActionValue = soapActionValue;
    }
}
