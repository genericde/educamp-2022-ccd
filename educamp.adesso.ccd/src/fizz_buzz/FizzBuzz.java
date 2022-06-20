package fizz_buzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  private List<Integer> numberRange = new ArrayList<>();

  public FizzBuzz() {
    this.initRange();
  }

  private void initRange() {
    this.numberRange = IntStream
      .rangeClosed(1, 100)
      .boxed()
      .collect(Collectors.toList());
  }

  public void doFizzBuzz() {
    this.iterateAndProcessNumberRange((Integer number) -> {
      String substitute = substituteNumber(number);
      displaySubstitute(substitute);
    });
  }

  private void iterateAndProcessNumberRange(Consumer<Integer> process) {
    Iterator<Integer> i = this.numberRange.iterator();
    while(i.hasNext()) {
      process.accept(i.next());
    }
  }

  private String substituteNumber(Integer number) {
    boolean fizzFlag = number % 3 == 0;
    boolean buzzFlag = number % 5 == 0;
    if (fizzFlag && buzzFlag) {
      return "FizzBuzz";
    } else if (fizzFlag) {
      return "Fizz";
    } else if (buzzFlag) {
      return "Buzz";
    } else {
      return number.toString();
    }
  }

  private void displaySubstitute(String toDisplay) {
    System.out.println(toDisplay);
  }
}
