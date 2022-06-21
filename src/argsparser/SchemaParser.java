package argsparser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class SchemaParser {
	
	private static Pattern tokenPattern = Pattern.compile("[a-z][\\*,\\?#]");

	static Map<Character, Class<?>> parseSchemaSpec(String schemaSpec) {
		var tokens = extractTokens(schemaSpec);
		var result = new HashMap<Character, Class<?>>();
		for (var token : tokens) {
			if (isValidToken(token)) {
				result.put(parseArgLetter(token), parseArgType(token));
			} else {
				throw new IllegalArgumentException("Invalid token : " + token);
			}
		}
		return result;
	}

	private static Class<?> parseArgType(String token) {
		var tokenType = token.charAt(1);
		return switch (tokenType) {
			case '*' -> String.class;
			case '?' -> Boolean.class;
			case '#' -> Integer.class;
			default -> throw new IllegalArgumentException("Invalid token type : " + tokenType);
		};
	}

	private static Character parseArgLetter(String token) {
		return token.charAt(0);
	}

	private static String[] extractTokens(String schemaSpec) {
		return schemaSpec.split(",");
	}

	private static boolean isValidToken(String token) {
		return tokenPattern.matcher(token).matches();
 	}
	
}
