package fizz_buzz_2;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzConverter {
    public static final String FIZZ_LABEL = "Fizz";
    public static final String BUZZ_LABEL = "Buzz";
    public static final String FIZZ_BUZZ_LABEL = FIZZ_LABEL + BUZZ_LABEL;
    public static List<String> convertFizzBuzz(List<Integer> numbers) {
        return numbers.stream()
                      .map(FizzBuzzConverter::convertFizzBuzz)
                      .collect(Collectors.toList());
    }

    public static String convertFizzBuzz(Integer number) {
        if (isFizz(number)) return FIZZ_LABEL;

        if (isBuzz(number)) return BUZZ_LABEL;

        if (isFizzBuzz(number)) return FIZZ_BUZZ_LABEL;

        return String.valueOf(number);
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
