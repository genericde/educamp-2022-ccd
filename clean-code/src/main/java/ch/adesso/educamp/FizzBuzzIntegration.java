package ch.adesso.educamp;

public class FizzBuzzIntegration {

    static void runFizzBuzz() {
        String[] range = RangeGenerator.generateRange();
        String[] convertedNumbers = FizzBuzzConverter.convert(range);
        Printer.print(convertedNumbers);
    }

}
