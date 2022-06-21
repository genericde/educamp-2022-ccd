package ch.adesso.educamp.schemaargs;

import java.util.Map;

public class ArgsParserIntegrator {

    public static String getValueForSchema(String[] args, String schema, char selectedArg) {

        Map<SchemaType, String> mapWithSchemaData = SchemaParser.parse(schema);
        Map<SchemaType, String> completeSchemaValueMap = ArgsParser.parse(mapWithSchemaData, args);
        String output = ValueExtractor.getValue(completeSchemaValueMap, selectedArg);

        return output;
    }

}
