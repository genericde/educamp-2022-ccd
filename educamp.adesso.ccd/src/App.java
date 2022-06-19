import fizz_buzz.FizzBuzz;
import roman_numerals.RomanNumeralsTest;

public class App {
    public static void main(String[] args) throws Exception {
        // Roman numerals
        RomanNumeralsTest rN = new RomanNumeralsTest();
        rN.test();

        // FizzBuzz
        FizzBuzz fB = new FizzBuzz();
        fB.doFizzBuzz();
    }
}
