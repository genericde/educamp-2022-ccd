package fizz_buzz_2;

public class FizzBuzz {
    public void run() {
        var numbers = RangeGenerator.generate();
        var resultList = FizzBuzzConverter.convert(numbers);
        Printer.printList(resultList);
    }
}
