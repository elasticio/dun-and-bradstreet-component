package io.elastic.dnb.soap.client;

public enum SoapAction {

  CLEANSE_AND_STANDARDIZE_MATCH(
      "http://services.dnb.com/CompanyService/V5.0/CleanseAndStandardize"),
  CONTACT_PRODUCT("http://services.dnb.com/ContactProductService/V4.0/OrderProduct"),
  CUSTOM_PRODUCT("http://services.dnb.com/CustomProductService/V3.1/OrderProduct"),
  FIND_COMPETITOR("http://services.dnb.com/EntityListService/V6.4/FindCompetitor"),
  FIRMOGRAPHICS("http://services.dnb.com/FirmographicsProductService/V6.1/OrderProduct"),
  FIND_COMPANY("http://services.dnb.com/EntityListService/V6.4/FindCompany"),
  GET_CLEANSE_MATCH("http://services.dnb.com/CompanyService/V5.0/GetCleanseMatch"),
  INDUSTRY_PRODUCT("http://services.dnb.com/IndustryProductService/V4.0/OrderProduct"),
  MATCH("http://services.dnb.com/CompanyService/V5.0/Match"),
  NEWS_AND_MEDIA_PRODUCT("http://services.dnb.com/NewsAndMediaProductService/V3.0/OrderProduct"),
  RATINGS("http://services.dnb.com/AssessmentProductService/V5.0/OrderProduct"),
  REPORT_PRODUCT("http://services.dnb.com/ReportProductService/V3.2/OrderCompanyReport"),
  SMALL_BUSINESS_RISK_INSIGHT("http://services.dnb.com/SBRIProductService/V3.2/OrderProduct");

  private String soapActionValue;

  public String getSoapActionValue() {
    return this.soapActionValue;
  }

  SoapAction(final String soapActionValue) {
    this.soapActionValue = soapActionValue;
  }
}
