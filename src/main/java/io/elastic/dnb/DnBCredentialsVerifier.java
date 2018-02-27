package io.elastic.dnb;

import com.dnb.services.match.*;
import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamException;

public class DnBCredentialsVerifier implements CredentialsVerifier {

    private static final Logger logger = LoggerFactory.getLogger(CredentialsVerifier.class);

    @Override
    public void verify(JsonObject configuration) throws InvalidCredentialsException {
        final String username = Utils.getConfigParam(configuration, AppConstants.USERNAME_CONFIG_NAME);
        logger.info("Got username = {}", username);

        final String password = Utils.getConfigParam(configuration, AppConstants.PASSWORD_CONFIG_NAME);

        if (username.isEmpty() || password.isEmpty()) {
            throw new InvalidCredentialsException("Username and Password can not be empty");
        }

        try {
            SOAPMessage response = new GenericSOAPClient.Builder()
                                        .setBodyObject(buildEmptyMatchRequest())
                                        .setEndpointUrl(EndpointUrl.COMPANY_5_0)
                                        .setSoapAction(SoapAction.MATCH)
                                        .setUsername(username)
                                        .setPassword(password)
                                        .call();
            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(MatchResponse.class, response);
            MatchResponse matchResponse = (MatchResponse) jaxbElement.getValue();

            //Codes of errors:
            //https://docs.dnb.com/direct/2.0/en-US/response-codes
            String resultId = matchResponse.getTransactionResult().getResultID();
            logger.info("Got response. ResultID = {}", resultId);
            String resultText = matchResponse.getTransactionResult().getResultID();
            logger.info("Got response. ResultText = {}", resultText);

            //SC001-SC014 - codes of user credentials error
            if (resultId.contains("SC")) {
                throw new InvalidCredentialsException(resultId + ":" + resultText);
            }

        } catch (SOAPException | JAXBException e) {
            e.printStackTrace();
            throw new RuntimeException("Oops, there some SOAP exceptions. Check logs.");
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static MatchRequest buildEmptyMatchRequest() {
        return new MatchRequest();
    }
}
