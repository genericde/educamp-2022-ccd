package argsparser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ArgsParser {
	
	private static final Pattern tokenPattern = Pattern.compile("\\-([a-z])(.*)");

	public static Object parse(String schemaSpec, String args, Character selectedArg) {
		var parsedSchema = SchemaParser.parseSchemaSpec(schemaSpec);
		var parsedArgs = parseArgs(args, parsedSchema);
		return getValue(selectedArg, parsedSchema, parsedArgs);
	}

	private static Object getValue(Character selectedArg, Map<Character, Class<?>> parsedSchema,
			Map<Character, Argument> parsedArgs) {
		validateArgLetter(selectedArg, parsedSchema);
		var arg = parsedArgs.get(selectedArg);
		if (arg == null) {
			if (isMissingFlag(selectedArg, parsedSchema)) {
				return false;
			}
			throw new IllegalArgumentException("Illegal argument");
		}
		return arg.asTypedValue(parsedSchema.get(arg.letter()));
	}

	private static Map<Character, Argument> parseArgs(String args, Map<Character, Class<?>> parsedSchema) {
		var result = new HashMap<Character, Argument>();
		var tokens = args.split(" ");
		for (var token : tokens) {
			var arg = parseToken(token);
			validateArgLetter(arg.letter(), parsedSchema);
			result.put(arg.letter(), arg);
		}
		return result;
	}

	private static boolean isMissingFlag(Character selectedArg, Map<Character, Class<?>> parsedSchema) {
		return parsedSchema.get(selectedArg) == Boolean.class;
	}

	private static void validateArgLetter(Character argLetter, Map<Character, Class<?>> parsedSchema) {
		if (!parsedSchema.containsKey(argLetter)) {
			throw new IllegalArgumentException("Arg does not belong to schema");
		}
	}

	private static Argument parseToken(String token) {
		var matcher = tokenPattern.matcher(token);
		if (!matcher.matches()) {
			throw new IllegalArgumentException("Illegal format for argument token : " + token);
		}
		return new Argument(matcher.group(1).charAt(0), matcher.group(2));
	}
}
