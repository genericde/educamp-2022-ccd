package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void printFizzBuzz(int range) {
        for (String fizzBuzzLine: buildFizzBuzz(range)) {
            printFizzBuzzLine(fizzBuzzLine);
        }
    }

    private static void ensureRangeIsValid(int range) {
        if (range < 2) {
            throw new IllegalArgumentException("Range of FIZZBUZZ needs to be greater then 2, but was:" + range);
        }
    }
    private static void ensureNumberIsValid(int range) {
        if (range < 2) {
            throw new IllegalArgumentException("Number of FIZZBUZZ needs to be greater then 2, but was:" + range);
        }
    }

    private static void printFizzBuzzLine(String fizzBuzzLine) {
        System.out.println(fizzBuzzLine);
    }

    public static List<String> buildFizzBuzz(int range) {
        ensureRangeIsValid(range);
        var fizzBuzzArray = new ArrayList<String>();

        for (int number = 1; number <= range; number++) {
            fizzBuzzArray.add(buildFizzBuzzLine(number));
        }

        return fizzBuzzArray;
    }

    public static String buildFizzBuzzLine(int number) {
        ensureNumberIsValid(number);
        var printString = "";

        if (isFizz(number)) {
            printString += "FIZZ";
        }

        if (isBuzz(number)) {
            printString += "BUZZ";
        }

        if (isStringEmpty(printString)) {
            printString += number;
        }

        return printString;
    }

    private static boolean isStringEmpty(String lineToPrint) {
        return lineToPrint.length() == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
