package main.java.argsparser;

public class ArgsParserIntergration {
    public static void main(String[] args) {
        Object valueForSchema = getValueForSchema("f?,j#,w*", "-f -j123 -wSomeText", "f");
        System.out.println("value: " + valueForSchema + ", type: " + valueForSchema.getClass());
    }

    public static  <T> T getValueForSchema(String schemaSpec, String args, String selectedArg) {
        ParsedSchema parsedSchema = SchemaParser.parse(schemaSpec);
        ParsedArguments parsedArguments = ArgsParser.parse(args, parsedSchema);
        return (T) ValueExtractor.get(parsedSchema, parsedArguments, selectedArg);
    }

}
