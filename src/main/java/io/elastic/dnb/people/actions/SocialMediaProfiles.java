package io.elastic.dnb.people.actions;

import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.dnb.rest.client.BaseUri;
import io.elastic.dnb.rest.client.GenericRESTClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

public class SocialMediaProfiles implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(io.elastic.dnb.people.actions.ContactPeopleProfiles.class);

    @Override
    public void execute(ExecutionParameters parameters) {

        JsonObject configuration = parameters.getConfiguration();
        Message data = null;
        JsonObject jsonDataObject = null;

        JsonObject body = parameters.getMessage().getBody();
        logger.info("About to call DnB API. Request message: {}", body.toString());

        String partnerIndentifier = body.getString("PartnerIndentifier");
        String partnerUri = body.getString("PartnerUri");
        String target = body.getString("Target");
        String targetValue = body.getString("TargetValue");

        JsonObject responseJson = null;
        try

        {
            responseJson = new GenericRESTClient.Builder()
                    .setBaseUri(BaseUri.SOCIAL_MEDIA_PROFILES.getBaseUriValue())
                    .appendPath(partnerIndentifier)
                    .appendPath(partnerUri)
                    .setAccept(MediaType.APPLICATION_JSON)
                    .setHttpMethod(HttpMethod.GET)
                    .setUsername("P200000E291E8762A114FBF95791A2BE")
                    .setPassword("tcyt9ucg")
                    .call();

            data = new Message.Builder().body(jsonDataObject).build();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            data = (new Message.Builder())
                    .body(Json.createObjectBuilder()
                            .add("result", e.getMessage())
                            .build())
                    .build();
            parameters.getEventEmitter().emitException(e);
        }

        parameters.getEventEmitter().emitData(data);

        System.out.println("response:" + responseJson.toString());
    }
}
