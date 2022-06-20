package fizz_buzz_2;

import java.util.List;

public class Printer {
    public static void printFizzBuzz(List<String> fizzBuzz) {
        for (var fizzBuzzLine : fizzBuzz) {
            printFizzBuzzLine(fizzBuzzLine);
        }
    }

    private static void printFizzBuzzLine(String fizzBuzzLine) {
        System.out.println(fizzBuzzLine);
    }
}
