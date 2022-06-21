package main.java.argsparser;

public class SchemaParser {

    public static ParsedSchema parse(String schemaSpec) {
        String[] splitedSchemaParts = schemaSpec.split(",");
        ParsedSchema parsedSchema = new ParsedSchema();
        for (String schemaPart : splitedSchemaParts){
            if (schemaPart.contains("?")){
                parsedSchema.schemaLetterForBoolean = getSchemaLetterForBoolean(schemaPart, "/?");
            } else if (schemaPart.contains("*")) {
                parsedSchema.schemaLetterForString = getSchemaLetterForBoolean(schemaPart, "/*");
            } else if (schemaPart.contains("#")) {
                parsedSchema.schemaLetterForInteger = getSchemaLetterForBoolean(schemaPart, "#");
            } else {
                throw new IllegalArgumentException("Invalid Schema Arguments");
            }
        }
        return parsedSchema;
    }

    private static String getSchemaLetterForBoolean(String schemaPart, String regex) {
        return schemaPart.split(regex)[0];
    }
}
