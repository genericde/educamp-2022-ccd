package fizz_buzz_2;

public class FizzBuzz {
    public void fizzBuzz() {
        var numbers = RangeGenerator.generate();
        var fizzBuzz = FizzBuzzConverter.convertFizzBuzz(numbers);
        Printer.printFizzBuzz(fizzBuzz);
    }
}
