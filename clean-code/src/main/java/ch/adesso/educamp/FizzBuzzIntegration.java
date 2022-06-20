package ch.adesso.educamp;

public class FizzBuzzIntegration {

    static void runFizzBuzz() {
        String[] numbersInRange = RangeGenerator.generateRange();
        String[] fizzBuzzNumbers = FizzBuzzConverter.convert(numbersInRange);
        Printer.print(fizzBuzzNumbers);
    }

}
