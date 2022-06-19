package educamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        playFizzBuzz();
    }

    private static void playFizzBuzz() {
        String[] numbers = createNumberList();
        String[] fizzBuzzNumbers = replaceWithFizzBuzz(numbers);
        printOutput(fizzBuzzNumbers);
    }

    private static void printOutput(String[] fizzBuzzNumbers) {
        Arrays.asList(fizzBuzzNumbers).forEach(n -> {
            System.out.print(n + " ");
        });
    }

    private static String[] createNumberList() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(String.valueOf(i));
        }
        return numbers.toArray(new String[0]);
    }

    private static String[] replaceWithFizzBuzz(String[] numbersWithReplacement) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbersWithReplacement[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                numbersWithReplacement[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                numbersWithReplacement[i-1] = "Buzz";
            }
        }
        return numbersWithReplacement;
    }


}
