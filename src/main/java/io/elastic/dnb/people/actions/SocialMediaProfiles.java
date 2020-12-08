package io.elastic.dnb.people.actions;

import io.elastic.api.ExecutionParameters;
import io.elastic.api.Function;
import io.elastic.api.Message;
import io.elastic.dnb.Utils;
import io.elastic.dnb.rest.client.BaseUri;
import io.elastic.dnb.rest.client.GenericRESTClient;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocialMediaProfiles implements Function {

  protected static final Logger logger = LoggerFactory
      .getLogger(io.elastic.dnb.people.actions.ContactPeopleProfiles.class);

  @Override
  public void execute(final ExecutionParameters parameters) {

    JsonObject configuration = parameters.getConfiguration();
    Message data;

    JsonObject body = parameters.getMessage().getBody();
    logger.info("About to call DnB API with the request message");

    String partnerIdentifier = body.getString("PartnerIdentifier");
    String target = body.getString("Target");
    String targetValue = body.getString("TargetValue");

    JsonObject responseJson;
    try {
      responseJson = new GenericRESTClient.Builder()
          .setBaseUri(BaseUri.SOCIAL_MEDIA_PROFILES.getBaseUriValue())
          .appendPath(partnerIdentifier)
          .setTarget(target, targetValue)
          .setAccept(MediaType.APPLICATION_JSON)
          .setHttpMethod(HttpMethod.GET)
          .setUsername(Utils.getUsername(configuration))
          .setPassword(Utils.getPassword(configuration))
          .call();

      data = new Message.Builder().body(responseJson).build();

    } catch (InterruptedException | IOException e) {
      logger.error(
          "Oops! There was an error trying to call the SOAP API. See the emitted error message for the details");
      data = (new Message.Builder())
          .body(Json.createObjectBuilder()
              .add("result", e.getMessage())
              .build())
          .build();
      parameters.getEventEmitter().emitException(e);
    }

    parameters.getEventEmitter().emitData(data);

  }
}
