package io.elastic.dnb.soap.client;

    public enum SoapAction {

        MATCH("http://services.dnb.com/CompanyService/V5.0/Match"),
        BLABLA("");

        private String soapActionValue;

        public String getSoapActionValue() {
            return this.soapActionValue;
        }

        SoapAction (String soapActionValue) {
            this.soapActionValue = soapActionValue;
        }
}
