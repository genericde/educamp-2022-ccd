package ch.markusborer.argparser;

import java.util.HashMap;
import java.util.Map;

public class ArgParser {

    public static Object parse(String schema, String arguments, String selectedArgument) {
        Map<String, TypeParser> parsedSchema = parseSchema(schema);
        Map<String, Object> parsedArguments = parseArguments(parsedSchema, arguments);
        return getSelectedArgument(parsedArguments, selectedArgument);
    }

    static Map<String, TypeParser> parseSchema(String schema) {
        String[] schemaParts = schema.split(",");
        Map<String, TypeParser> parsedSchema = new HashMap<>();
        for (String schemaPart: schemaParts) {
            String key = getSchemaKey(parsedSchema, schemaPart);
            TypeParser typeParser = getTypeParser(schemaPart);
            parsedSchema.put(key, typeParser);
        }
        return parsedSchema;
    }

    private static String getSchemaKey(Map<String, TypeParser> parsedSchema, String schemaPart) {
        String key = schemaPart.substring(0, 1);
        if (parsedSchema.containsKey(key)) {
            throw new IllegalArgumentException("The parameter " + key + " is used twice");
        }
        return key;
    }

    private static TypeParser getTypeParser(String schemaPart) {
        String typeSymbol = schemaPart.substring(1, 2);
        TypeParser typeParser = switch (typeSymbol) {
            case "?" -> new BooleanTypeParser();
            case "#" -> new IntegerTypeParser();
            case "*" -> new StringTypeParser();
            default -> throw new IllegalArgumentException(typeSymbol + " is not a valid symbol");
        };
        return typeParser;
    }

    static Map<String, Object> parseArguments(Map<String,TypeParser> schema, String arguments) {
        String[] argumentsParts = arguments.split(" ");
        Map<String, Object> parsedArguments = new HashMap<>();
        for (String argumentPart : argumentsParts) {
            if (argumentPart.length() < 2 || !argumentPart.startsWith("-")) {
                throw new IllegalArgumentException("The parameter " + argumentPart + " has invalid format");
            }
            String key = getArgumentKey(parsedArguments, argumentPart);
            Object value = getArgumentValue(schema, argumentPart, key);
            parsedArguments.put(key, value);
        }
        return parsedArguments;
    }

    private static String getArgumentKey(Map<String, Object> parsedArguments, String argumentPart) {
        String key = argumentPart.substring(1, 2);
        if (parsedArguments.containsKey(key)) {
            throw new IllegalArgumentException("The parameter " + key + " is passed twice");
        }
        return key;
    }

    private static Object getArgumentValue(Map<String, TypeParser> schema, String argumentPart, String key) {
        TypeParser typeParser = schema.get(key);
        if (typeParser == null) {
            throw new IllegalArgumentException("The parameter " + key + " is not available in the schema");
        }
        Object value = typeParser.parse(argumentPart.substring(2));
        return value;
    }

    static Object getSelectedArgument(Map<String,Object> parsedArguments, String selectedArgument) {
        if (!parsedArguments.containsKey(selectedArgument)) {
            throw new IllegalArgumentException("The parameter " + selectedArgument + " is not available");
        }
        return parsedArguments.get(selectedArgument);
    }

}
