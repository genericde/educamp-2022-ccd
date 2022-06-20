package main.java.fizz.buzz;

import java.util.List;

public class FreeBuzzIntegration {

    public static void main(String[] args) {
        List<Integer> numbers = RangeGenerator.generateListFromRange();
        List<String> results = FizzBuzzConveter.convertFizzBuzzNumbers(numbers);
        Printer.printFizzBuzzOutput(results);
    }
}
