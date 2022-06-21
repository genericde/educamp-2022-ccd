package argparser;

public class ArgsParserImplementation {

	public static void main(String[] args) {
		
		ParsedSchema parsedSchema = SchemaParser.parseSchema(args[0]);
		ParsedArgs parsedArgs = ArgsParser.parseArgs(args[1], parsedSchema);
		String value = ValueExtractor.get(args[2], parsedArgs);
		System.out.println(value);
		
	}

}
