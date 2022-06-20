package fizz_buzz_2;

// Some comment
public class FizzBuzz {
    public void run() {
        var numbers = RangeGenerator.generate();
        var resultList = FizzBuzzConverter.convert(numbers);
        Printer.printList(resultList);
    }
}
        // Some comment



