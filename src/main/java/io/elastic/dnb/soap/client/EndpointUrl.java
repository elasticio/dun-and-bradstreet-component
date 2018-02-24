package io.elastic.dnb.soap.client;

    public enum EndpointUrl {

        V5("https://direct.dnb.com/Company/V5.0"),
        BLABLA("");

        private String endpointUrl;

        EndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
        }

        public String getEndpointUrl() {
            return this.endpointUrl;
        }
    }
