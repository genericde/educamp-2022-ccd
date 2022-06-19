package RomanNumerals;

public class RomanNumeralConverter {
    public static int convertNumeralToDecimal(String romanNumerals) {
        return convertNumeralToDecimal(romanNumerals.getBytes());
    }

    private static int convertNumeralToDecimal(byte[] romanNumerals) {
        var decimalSum = 0;
        var lastNumeralValue = 0;

        for (int index = romanNumerals.length; index > 0; index--) {
            var literalValue = convertLiteralToDecimal(romanNumerals[index - 1]);

            decimalSum += sumLiteralValues(lastNumeralValue, literalValue);

            lastNumeralValue = literalValue;
        }

        return decimalSum;
    }

    private static int sumLiteralValues(int lastLiteralValue, int literalValue) {
        var decimalSum = 0;

        if (lastLiteralValue == 0) {
            decimalSum = literalValue;
        } else if (literalValue < lastLiteralValue) {
            decimalSum -= literalValue;
        } else {
            decimalSum += literalValue;
        }

        return decimalSum;
    }

    public static int convertLiteralToDecimal(byte numeral) {
        return switch (numeral) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("The given numeral: '" + numeral + "' is invalid or not supported." + "The following are accepted: I,V,X,L,C,D,M");
        };
    }
}
