package io.elastic.dnb;

import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;

import javax.json.JsonObject;

public class DnBCredentialsVerifier implements CredentialsVerifier {

    @Override
    public void verify(JsonObject configuration) throws InvalidCredentialsException {
        //TODO: implement
    }
}
