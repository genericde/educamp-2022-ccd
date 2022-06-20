package ch.adesso.exam3;

import java.util.List;

public final class FizzBuzzIntegration {

    public static void main(String[] args) {
        List<Integer> number = RangeGenerator.generateRange();
        List<String> result = FizzBuzzConverter.convert(number);
        Printer.print(result);
    }
}
