package main.java.argsparser;

public class SchemaParser {

    public static ParsedSchema parse(String schemaSpec) {
        String[] splitedSchemas = schemaSpec.split(",");
        ParsedSchema parsedSchema = new ParsedSchema();
        for (String schema : splitedSchemas){
            if (schema.contains("?")){
                parsedSchema.schemaLetterForBoolean = schema.split("/?")[0];
            } else if (schema.contains("*")) {
                parsedSchema.schemaLetterForString = schema.split("/*")[0];
            } else if (schema.contains("#")) {
                parsedSchema.schemaLetterForInteger = schema.split("#")[0];
            } else {
                throw new IllegalArgumentException("Invalid Schema Arguments");
            }
        }
        return parsedSchema;
    }
}
