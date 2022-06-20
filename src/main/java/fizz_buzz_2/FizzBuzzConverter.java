package fizz_buzz_2;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzConverter {
    public static List<String> convertFizzBuzz(List<Integer> numbers) {
        return numbers.stream()
                      .map(FizzBuzzConverter::convertFizzBuzz)
                      .collect(Collectors.toList());
    }

    public static String convertFizzBuzz(Integer number) {
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
