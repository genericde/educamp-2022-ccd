package fizz_buzz.their_fizz_buzz;

import java.util.Iterator;
import java.util.List;

public class FizzBuzzPrinter {
  static void printResult(List<String> result) {
    Iterator<String> i = result.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
