package ch.adesso.educamp.schemaargs;

import java.util.Arrays;
import java.util.Map;


public class ArgsParser {
    static Map<SchemaType, String> parse(Map<SchemaType, String> schemaMap, String[] args) {

        Arrays.stream(args).toList().forEach(arg -> {
            schemaMap.put(SchemaType.valueOf(arg.substring(0, 1)), arg.substring(1));
        });

        return schemaMap;
    }

}
