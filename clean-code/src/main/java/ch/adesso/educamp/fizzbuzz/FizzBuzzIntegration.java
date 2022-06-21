package ch.adesso.educamp.fizzbuzz;

public class FizzBuzzIntegration {

    static void runFizzBuzz() {
        String[] numbersInRange = RangeGenerator.generateRange();
        String[] fizzBuzzNumbers = FizzBuzzConverter.convert(numbersInRange);
        Printer.print(fizzBuzzNumbers);
    }

}
