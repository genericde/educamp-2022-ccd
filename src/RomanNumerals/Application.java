package RomanNumerals;

public class Application {
    public static void main(String[] args) {
        var romanNumerals = "I";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "II";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "IV";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "V";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "IX";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "XLII";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "XCIX";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));

        romanNumerals = "MMXXII";
        printOutSolution(romanNumerals, convertRomanNumeralsToDecimal(romanNumerals.getBytes()));
    }

    private static void printOutSolution(String romanNumerals, int decimalSum) {
        System.out.println("Roman numeral: '" + romanNumerals + "' equals to: '" + decimalSum + "' in decimal.");
    }

    private static int convertRomanNumeralsToDecimal(byte[] romanNumerals) {
        var decimalSum = 0;
        var lastNumeralValue = 0;
        for (int index = romanNumerals.length; index > 0; index--) {
            var numeralValue = determineNumeralValue(romanNumerals[index - 1]);

            if (lastNumeralValue == 0) {
                decimalSum = numeralValue;
            } else if (numeralValue < lastNumeralValue) {
                decimalSum -= numeralValue;
            } else {
                decimalSum += numeralValue;
            }

            lastNumeralValue = numeralValue;
        }

        return decimalSum;
    }

    public static int determineNumeralValue(Byte numeral) {
        return switch (numeral) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("The given numeral: '" + numeral + "' is invalid." + "The following are accepted: I,V,X,L,C,D,M");
        };
    }
}
