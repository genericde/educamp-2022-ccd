package romannumerals;

enum RomanLiteral {

	ONE(1, 'I', 1),
	FIVE(5, 'V', 4),
	TEN(10, 'X', 9),
	FIFTY(50, 'L', 40);

	public static final RomanLiteral LAST = FIFTY;
	
	private int decimalValue;
	private char descriptor;
	private int decimalBase;
	
	RomanLiteral(int decimalValue, char descriptor, int decimalBase) {
		this.decimalValue = decimalValue;
		this.descriptor = descriptor;
		this.decimalBase = decimalBase;
	}
	
	int decimalValue() {
		return decimalValue;
	}
	
	int decimalBase() {
		return decimalBase;
	}

	@Override
	public String toString() {
		return String.valueOf(descriptor);
	}
}
