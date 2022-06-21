package ch.adesso.educamp.schemaargs;

import java.util.Map;

public class ValueExtractor {

    static String getValue(Map<SchemaType, String> map, char selection) {
        return map.get(SchemaType.valueOf(String.valueOf(selection)));
    }

}
