package fizz_buzz.their_fizz_buzz;

import java.util.List;

public class FizzBuzz {
  static public List<String> doFizzBuzz() {
    List<Integer> numberRange = FizzBuzzGenerator.generateRange();
    List<String> convertedRange = FizzBuzzConverter.convertRange(numberRange);
    FizzBuzzPrinter.printResult(convertedRange);
    return convertedRange;
  }
}
