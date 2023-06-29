package io.elastic.dnb;

import com.dnb.services.company.MatchRequest;
import com.dnb.services.company.MatchResponse;
import io.elastic.api.CredentialsVerifier;
import io.elastic.api.InvalidCredentialsException;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import jakarta.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DnBCredentialsVerifier implements CredentialsVerifier {

  private static final Logger logger = LoggerFactory.getLogger(CredentialsVerifier.class);

  @Override
  public void verify(final JsonObject configuration) throws InvalidCredentialsException {
    final String username = Utils.getConfigParam(configuration, AppConstants.USERNAME_CONFIG_NAME);
    final String password = Utils.getConfigParam(configuration, AppConstants.PASSWORD_CONFIG_NAME);

    if (username.isEmpty() || password.isEmpty()) {
      throw new InvalidCredentialsException("Username and Password can not be empty");
    }

    logger.info("Credentials verification started. Trying to call basic endpoint");
    try {
      final SOAPMessage response = new GenericSOAPClient.Builder()
          .setRequestClass(MatchRequest.class)
          .setBodyObject(buildEmptyMatchRequest())
          .setEndpointUrl(EndpointUrl.COMPANY_5_0)
          .setSoapAction(SoapAction.MATCH)
          .setUsername(Utils.getUsername(configuration))
          .setPassword(Utils.getPassword(configuration))
          .call();
      final JAXBElement jaxbElement = new GenericSOAPClient.Builder()
          .bindToJaxb(MatchResponse.class, response);
      final MatchResponse matchResponse = (MatchResponse) jaxbElement.getValue();

      //Codes of errors:
      //https://docs.dnb.com/direct/2.0/en-US/response-codes
      final String resultId = matchResponse.getTransactionResult().getResultID();
      logger.debug("Got response. ResultID = {}", resultId);
      final String resultText = matchResponse.getTransactionResult().getResultID();

      //SC001-SC014 - codes of user credentials error
      if (resultId.contains("SC")) {
        logger.error("Credentials verification failed. Result ID={}", resultId);
        throw new InvalidCredentialsException(resultId + ":" + resultText);
      }
    } catch (SOAPException | JAXBException | XMLStreamException e) {
      logger.error("Credentials verification failed");
      throw new RuntimeException(e);
    }
    logger.info("Credentials verified successfully");
  }

  private static MatchRequest buildEmptyMatchRequest() {
    return new MatchRequest();
  }
}
