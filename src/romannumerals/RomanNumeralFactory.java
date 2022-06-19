package romannumerals;

public final class RomanNumeralFactory {
	
	public RomanNumeral fromDecimalValue(int decimalValue) {
		if (!isInRange(decimalValue)) {
			throw new IllegalArgumentException("Not in range");
		}
		var romanNumeral = new MutableRomanNumeral();
		while (decimalValue > 0) {
			decimalValue = addLiteral(decimalValue, romanNumeral);
			if (decimalValue < 0) {
				decimalValue = addCompensation(decimalValue, romanNumeral);
			}
		}
		return romanNumeral.toImmutable();
	}

	private int addLiteral(int decimalValue, MutableRomanNumeral romanNumeral) {
		var literal = getHighestLiteral(decimalValue);
		romanNumeral.addLast(literal);
		decimalValue -= literal.decimalValue();
		return decimalValue;
	}

	private int addCompensation(int decimalValue, MutableRomanNumeral romanNumeral) {
		var lastLiteral = romanNumeral.last().get();
		var compensationLiteral = getHighestLiteral(lastLiteral.decimalValue() - lastLiteral.decimalBase());
		romanNumeral.addPrevious(compensationLiteral);
		decimalValue += compensationLiteral.decimalValue();
		return decimalValue;
	}
	
	private boolean isInRange(int decimalValue) {
		return decimalValue > 0 && decimalValue < RomanLiteral.LAST.decimalValue();
	}

	private RomanLiteral getHighestLiteral(int decimalValue) {
		return RomanLiteralBounds.instance().findHighestLiteral(decimalValue).get();
	}
}
