package roman_numerals;

public class RomanNumeralConverter {
    public static int convertNumeralToDecimal(String romanNumeral) {
        ensureRomanNumeralIsValid(romanNumeral);
        return convertNumeralToDecimal(romanNumeral.getBytes());
    }

    private static void ensureRomanNumeralIsValid(String romanNumeral) {
        var romanNumeralArray = romanNumeral.getBytes();
        for (int literalIndex = 0; literalIndex < romanNumeralArray.length; literalIndex++) {
            System.out.println(romanNumeralArray[literalIndex]);
            System.out.println(romanNumeralArray);
            var literal = RomanLiteralEnum.lookup(romanNumeralArray[literalIndex]);

            if (romanNumeralArray.length < literalIndex + (literal.allowedReoccurrences + 1)) {
                return;
            }

            var illegalReoccurrence = RomanLiteralEnum.lookup(romanNumeralArray[literalIndex + (literal.allowedReoccurrences + 1)]);
            if (literal.equals(illegalReoccurrence)) {
                throw new IllegalArgumentException("The given literal: '" + literal + "' can't be repeated more than " + literal.allowedReoccurrences + " times.");
            }
        }
    }

    private static int convertNumeralToDecimal(byte[] romanNumeral) {
        var decimalSum = 0;
        var lastLiteralValue = 0;

        for (int index = romanNumeral.length; index > 0; index--) {
            var literal = RomanLiteralEnum.valueOf(String.valueOf(romanNumeral[index - 1]));

            decimalSum += sumLiterals(lastLiteralValue, literal);

            lastLiteralValue = literal.decimalValue;
        }

        return decimalSum;
    }

    private static int sumLiterals(int lastLiteral, RomanLiteralEnum literal) {
        var decimalSum = 0;

        if (lastLiteral == 0) {
            decimalSum = literal.decimalValue;
        } else if (literal.decimalValue < lastLiteral) {
            decimalSum -= literal.decimalValue;
        } else {
            decimalSum += literal.decimalValue;
        }

        return decimalSum;
    }
}
