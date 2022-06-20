package fizz_buzz_2;

public class FizzBuzz {
    public void run() {
        var numbers = RangeGenerator.generate();
        var fizzBuzz = FizzBuzzConverter.convert(numbers);
        Printer.print(fizzBuzz);
    }
}
