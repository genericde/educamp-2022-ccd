public class App {
    public static void main(String[] args) throws Exception {
        // Roman numerals
        String romanNumeral = new String("XLII");
        RomanNumerals rN = new RomanNumerals();
        long decimalValue = rN.translateRomanNumeral(romanNumeral);
        System.out.println(decimalValue);
    }
}
