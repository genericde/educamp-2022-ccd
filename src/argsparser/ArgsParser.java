package argsparser;

import java.util.Map;
import java.util.regex.Pattern;

public class ArgsParser {
	
	private static final Pattern tokenPattern = Pattern.compile("\\-([a-z])(.*)");

	public static Object parse(String schemaSpec, String args, Character selectedArg) {
		var parsedSchema = SchemaParser.parseSchemaSpec(schemaSpec);
		validateArgLetter(selectedArg, parsedSchema);
		var tokens = args.split(" ");
		for (var token : tokens) {
			var arg = parseToken(token);
			validateArgLetter(arg.letter(), parsedSchema);
			if (arg.letter() == selectedArg.charValue()) {
				return arg.asTypedValue(parsedSchema.get(arg.letter()));
			}
		}
		if (isMissingFlag(selectedArg, parsedSchema)) {
			return false;
		}
		return null;
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
