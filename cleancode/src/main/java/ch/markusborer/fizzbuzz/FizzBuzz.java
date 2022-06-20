package ch.markusborer.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        // Variante 1
        IntStream.range(1, 101).mapToObj(FizzBuzz::convert).forEach(System.out::println);
        // Variante 2
        List<Integer> numbers = generateRange();
        List<String> result = convert(numbers);
        print(result);
    }

    private static List<Integer> generateRange() {
        return IntStream.range(1, 101).boxed().collect(Collectors.toList());
    }

    private static List<String> convert(List<Integer> numbers) {
        return numbers.stream().map(FizzBuzz::convert).collect(Collectors.toList());
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

    private static void print(List<String> result) {
        result.forEach(System.out::println);
    }
}
