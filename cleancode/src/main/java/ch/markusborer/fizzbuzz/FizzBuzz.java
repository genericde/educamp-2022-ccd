package ch.markusborer.fizzbuzz;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String[] args) {
        // Variante 1
        IntStream.range(1, 101).mapToObj(FizzBuzz::convert).forEach(System.out::println);
        // Variante 2
        IntStream numberRange = generateRange();
        Stream<String> convertedData = numberRange.mapToObj(convert());
        convertedData.forEach(printResult());
    }

    private static IntStream generateRange() {
        return IntStream.range(1, 101);
    }

    private static IntFunction<String> convert() {
        return FizzBuzz::convert;
    }

    public static String convert(Integer i) {
        boolean isDividibleBy3 = i % 3 == 0;
        boolean isDividibleBy5 = i % 5 == 0;
        return switch (i) {
            case Integer j && isDividibleBy3 && isDividibleBy5 -> "FizzBuzz";
            case Integer j && isDividibleBy3 -> "Fizz";
            case Integer j && isDividibleBy5 -> "Buzz";
            default -> String.valueOf(i);
        };
    }

    private static Consumer<String> printResult() {
        return System.out::println;
    }
}
