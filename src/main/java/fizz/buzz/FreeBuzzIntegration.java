package main.java.fizz.buzz;

import java.util.List;

public class FreeBuzzIntegration {

    public static void main(String[] args) {
        RangeGenerator rangeGenerator = new RangeGenerator(1, 100);
        List<Integer> numbers = rangeGenerator.generateListFromRange();
        List<String> results = FizzBuzzConveter.convertFizzBuzzNumbers(numbers);
        Printer.printFizzBuzzNumber(results);
    }
}
