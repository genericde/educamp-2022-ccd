package RomanNumerals;

public class Application {
    public static void main(String[] args) {
        var romanNumeral = "I";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "II";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "IV";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "V";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "IX";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "XLII";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "XCIX";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));

        romanNumeral = "MMXXII";
        printOutSolution(romanNumeral, RomanNumeralConverter.convertNumeralToDecimal(romanNumeral));
    }

    private static void printOutSolution(String romanNumerals, int decimalSum) {
        System.out.println("Roman numeral: '" + romanNumerals + "' equals to: '" + decimalSum + "' in decimal.");
    }
}
