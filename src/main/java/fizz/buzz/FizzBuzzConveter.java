package main.java.fizz.buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzConveter {

    public static final String BUZZ_VALUE = "Buzz";
    public static final String FIZZ_VALUE = "Fizz";

    public static List<String> convertFizzBuzzNumbers(List<Integer> numbers) {
        List<String> results = new ArrayList<>();
        for (Integer number : numbers) {
            convertNumber(number);
        }
        return results;
    }

    public static String convertNumber(Integer number) {
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
