package fizz_buzz.their_fizz_buzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FizzBuzzConverter {
  static List<String> convertRange(List<Integer> numberRange) {
    List<String> converted = new ArrayList<>();

    Iterator<Integer> i = numberRange.iterator();
    while(i.hasNext()) {
      Integer number = i.next();
      boolean fizzFlag = number % 3 == 0;
      boolean buzzFlag = number % 5 == 0;
      if (fizzFlag && buzzFlag) {
        converted.add("FizzBuzz");
      } else if (fizzFlag) {
        converted.add("Fizz");
      } else if (buzzFlag) {
        converted.add("Buzz");
      } else {
        converted.add(number.toString());
      }
    }

    return converted;
  }
}
