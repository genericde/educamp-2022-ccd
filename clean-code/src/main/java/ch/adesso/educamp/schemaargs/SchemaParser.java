package ch.adesso.educamp.schemaargs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchemaParser {


    static Map<SchemaType, String> parse(String schema) {

        String[] schemaElements = schema.split(",");
        Map<SchemaType, String> schemaTypesMap = new HashMap<>();
        Arrays.stream(schemaElements).toList().forEach(el -> {
            schemaTypesMap.put(getSchemaTypeFromString(el), null);

        });
        return schemaTypesMap;

    }

    private static SchemaType getSchemaTypeFromString(String el) {
        String schemaDefiningChar = el.substring(0, 1);
        return SchemaType.valueOf(schemaDefiningChar);
    }

}
