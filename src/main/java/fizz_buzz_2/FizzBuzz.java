package fizz_buzz_2;

public class FizzBuzz {
    public void fizzBuzz() {
        var range = RangeGenerator.generate(1, 100);
        var fizzBuzz = FizzBuzzConverter.convertFizzBuzz(range);
        Printer.printFizzBuzz(fizzBuzz);
    }
}
