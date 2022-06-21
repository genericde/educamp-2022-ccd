package main.java.argsparser;

public class ArgsParser {

    public static final String SPLIT_BY_FIRST_CHARACTER = "[a-z]";
    public static final String SPACE = " ";

    public static ParsedArguments parse(String args, ParsedSchema parsedSchema) {
        try {
            String[] splittedArgs = args.split(SPACE);
            ParsedArguments parsedArguments = new ParsedArguments();
            for (String arg : splittedArgs) {
                String firstCharaAsString = String.valueOf(arg.charAt(1));
                if (firstCharaAsString.equals(parsedSchema.schemaLetterForBoolean)) {
                    parsedArguments.setBooleanParsed(true);
                } else if (firstCharaAsString.equals(parsedSchema.schemaLetterForInteger)) {
                    Integer value = Integer.valueOf(arg.split("-" + firstCharaAsString)[1]);
                    parsedArguments.setIntParsed(value);
                } else if (firstCharaAsString.equals(parsedSchema.schemaLetterForString)) {
                    String value = arg.split("-" + firstCharaAsString)[1];
                    parsedArguments.setStringParsed(value);
                }
            }
            return parsedArguments;
        } catch (Exception ex){
            System.out.println("Could not Parse Arguments!");
        }
        return null;
    }
}
