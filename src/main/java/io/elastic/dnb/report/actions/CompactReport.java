package io.elastic.dnb.report.actions;

import com.dnb.services.company.GetCleanseMatchRequest;
import com.dnb.services.company.GetCleanseMatchResponse;
import com.dnb.services.report.OrderCompanyReportRequest;
import com.dnb.services.report.OrderCompanyReportResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.JSON;
import io.elastic.api.Message;
import io.elastic.api.Module;
import io.elastic.dnb.GenericSOAPClient;
import io.elastic.dnb.Utils;
import io.elastic.dnb.soap.client.EndpointUrl;
import io.elastic.dnb.soap.client.SoapAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.io.StringWriter;

public class CompactReport implements Module {

    protected static final Logger logger = LoggerFactory.getLogger(CompactReport.class);

    @Override
    public void execute(ExecutionParameters parameters) {

        JsonObject configuration = parameters.getConfiguration();
        Message data = null;
        JsonObject jsonDataObject = null;

        JsonObject body = parameters.getMessage().getBody();
        logger.info("About to call DnB API. Request message: {}", body.toString());
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        try {
            OrderCompanyReportRequest orderCompanyReportRequest = mapper.readValue(body.toString(), OrderCompanyReportRequest.class);

            SOAPMessage response = new GenericSOAPClient.Builder()
                    .setRequestClass(OrderCompanyReportRequest.class)
                    .setBodyObject(orderCompanyReportRequest)
                    .setEndpointUrl(EndpointUrl.REPORT_PRODUCT)
                    .setSoapAction(SoapAction.GET_CLEANSE_MATCH)
                    .setUsername(Utils.getUsername(configuration))
                    .setPassword(Utils.getPassword(configuration))
                    .call();

            JAXBElement jaxbElement = new GenericSOAPClient.Builder().bindToJaxb(OrderCompanyReportResponse.class, response);
            OrderCompanyReportResponse orderCompanyReportResponse = (OrderCompanyReportResponse) jaxbElement.getValue();

            ObjectMapper responseMapper = new ObjectMapper();
            StringWriter sw = new StringWriter();
            responseMapper.writeValue(sw, orderCompanyReportResponse);
            jsonDataObject = JSON.parseObject(sw.toString());

            data = new Message.Builder().body(jsonDataObject).build();

        } catch (JAXBException e) {
            throw new ClassCastException("Can't map JSON object to MatchRequest XML");
        } catch (IOException | XMLStreamException | SOAPException e) {
            e.printStackTrace();
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
