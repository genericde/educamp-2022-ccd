package argsparser;

record Argument(Character letter, String rawValue) {

	Object asTypedValue(Class<?> type) {
		if (type == String.class) {
			return rawValue;
		} else if (type == Integer.class) {
			return Integer.parseInt(rawValue);
		} else if (type == Boolean.class) {
			return parseBoolean();
		} else {
			throw new IllegalArgumentException("Unexpected type: " + type);
		}
	}
	
	private Boolean parseBoolean() {
		if (!rawValue.isEmpty()) {
			throw new IllegalArgumentException("Unexpected value for flag " + letter);
		}
		return true;
	}
}
