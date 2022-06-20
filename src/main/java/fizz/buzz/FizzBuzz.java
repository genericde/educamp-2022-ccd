package main.java.fizz.buzz;

public class FizzBuzz {

    public static final String BUZZ_VALUE = "Buzz";
    public static final String FIZZ_VALUE = "Fizz";

    public static String convertFizzBuzzNumber(int number) {
        if (isFizzBuzzNumber(number)) {
            return FIZZ_VALUE + BUZZ_VALUE;
        } else if (isBuzzNumber(number)) {
            return BUZZ_VALUE;
        } else if (isFizzNumber(number)) {
            return FIZZ_VALUE;
        } else {
            return String.valueOf(number);
        }
    }

    private static boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzzNumber(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizzBuzzNumber(int number) {
        return isFizzNumber(number) && isBuzzNumber(number);
    }

}
