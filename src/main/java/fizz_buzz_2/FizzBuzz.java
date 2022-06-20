package fizz_buzz_2;

public class FizzBuzz {
    public void run() {
        var numbers = RangeGenerator.generate();
        var fizzBuzzList = FizzBuzzConverter.convert(numbers);
        Printer.printList(fizzBuzzList);
    }
}
