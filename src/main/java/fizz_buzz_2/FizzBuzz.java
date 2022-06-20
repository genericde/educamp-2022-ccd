package fizz_buzz_2;

public class FizzBuzz {
    public void fizzBuzz() {
        var numberList = RangeGenerator.generate();
        var fizzBuzz = FizzBuzzConverter.convertFizzBuzz(numberList);
        Printer.printFizzBuzz(fizzBuzz);
    }
}
