package fizz_buzz.their_fizz_buzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzGenerator {
  static List<Integer> generateRange() {
    return IntStream
      .rangeClosed(1, 100)
      .boxed()
      .collect(Collectors.toList());
  }
}
