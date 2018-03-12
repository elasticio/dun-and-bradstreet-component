package io.elastic.dnb;

import com.dnb.services.customproduct.OrderProductRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

import javax.json.JsonObject;
import javax.json.JsonString;

public class Utils {

    //Private constructor to prevent instantiation. Since utility classes should not be instantiated
    private Utils() {}

    public static ObjectMapper createJaxbObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        final TypeFactory typeFactory = TypeFactory.defaultInstance();
        final AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(typeFactory);
        mapper.getDeserializationConfig().with(introspector);
        mapper.getSerializationConfig().with(introspector);
        return mapper;
    }

    public static String getConfigParam(final JsonObject config, final String key) {
        final JsonString value = config.getJsonString(key);

        if (value == null) {
            throw new IllegalStateException(String.format("Config parameter '%s' is required", key));
        }

        return value.getString();
    }

    public static String getUsername(final JsonObject config) {
        return Utils.getConfigParam(config, AppConstants.USERNAME_CONFIG_NAME);
    }

    public static String getPassword(final JsonObject config) {
        return Utils.getConfigParam(config, AppConstants.PASSWORD_CONFIG_NAME);
    }

    /**
     * Helper main method to convert JAXB class into Json schema.
     * To convert it just call this method
     * and pass .class to it. Then copy and paste the output to the *.in.json file
     *
     * @param args
     * @throws JsonProcessingException
     */
    public static void main(String[] args) throws JsonProcessingException {

        convertXsdToJson(OrderProductRequest.class);
    }

    private static void convertXsdToJson(final Class clazz) throws JsonProcessingException {
        ObjectMapper objectMapper = Utils.createJaxbObjectMapper();

        //To force mapper to include JAXB annotated properties in Json schema
        objectMapper.registerModule(new JaxbAnnotationModule());
        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
        objectMapper.acceptJsonFormatVisitor(objectMapper.constructType(clazz), visitor);

        JsonSchema inputSchema = visitor.finalSchema();
        String schemaString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(inputSchema);

        System.out.println(schemaString);
    }

}
