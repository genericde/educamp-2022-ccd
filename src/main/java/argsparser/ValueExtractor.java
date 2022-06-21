package main.java.argsparser;

public class ValueExtractor {

    public static <T> T get(ParsedSchema parsedSchema, ParsedArguments parsedArguments, String selectedArg) {
        if (parsedSchema.schemaLetterForBoolean.equals(selectedArg)){
            return (T) parsedArguments.isBooleanParsed();
        } else if (parsedSchema.schemaLetterForInteger.equals(selectedArg)) {
            return (T) parsedArguments.getIntParsed();
        } else if (parsedSchema.schemaLetterForString.equals(selectedArg)) {
          return (T) parsedArguments.getStringParsed();
        }
        throw new IllegalArgumentException("Could not Extract Value with wrong Arguments");
    }
}
