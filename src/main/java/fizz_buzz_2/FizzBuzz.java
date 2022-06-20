package fizz_buzz_2;

public class FizzBuzz {
    public void fizzBuzz() {
        var numbers = RangeGenerator.generate();
        var fizzBuzz = FizzBuzzConverter.convert(numbers);
        Printer.printFizzBuzz(fizzBuzz);
    }
}
