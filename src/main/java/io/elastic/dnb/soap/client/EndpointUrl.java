package io.elastic.dnb.soap.client;

    public enum EndpointUrl {

        V5("https://direct.dnb.com/Company/V5.0"),
        V6_4("https://direct.dnb.com/EntityList/V6.4");

        private String endpointUrl;

        EndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
        }

        public String getEndpointUrl() {
            return this.endpointUrl;
        }
    }
