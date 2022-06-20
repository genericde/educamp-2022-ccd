package fizz_buzz.their_fizz_buzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzzTest {
  Map<Integer, String> conversionResultToTest = new HashMap<>();

  public FizzBuzzTest() {
    this.setUp();
  }

  private void setUp() {
    conversionResultToTest.put(2, "2");
    conversionResultToTest.put(3, "Fizz");
    conversionResultToTest.put(5, "Buzz");
    conversionResultToTest.put(12, "Fizz");
    conversionResultToTest.put(15, "FizzBuzz");
    conversionResultToTest.put(18, "Fizz");
    conversionResultToTest.put(19, "19");
  }

  public void test() {
    List<Integer> numbersToTest = new ArrayList<>(conversionResultToTest.keySet());
    List<String> expectedResults = new ArrayList<>(conversionResultToTest.values());

    List<String> results = FizzBuzzConverter.convertRange(numbersToTest);

    int testFailCounter = 0;
    for (int i = 0; i < results.size(); i++) {
      if (!results.get(i).equals(expectedResults.get(i))) {
        System.out.println("Failed to convert " + numbersToTest.get(i) + " to " + expectedResults.get(i) + ". Got " + results.get(i) + ".");
        testFailCounter++;
        break;
      }
    }

    if (testFailCounter > 0) {
      System.out.println("There are test failures in FizzBuzzConverter");
    } else {
      System.out.println("Successfully tested FizzBuzzConverter");
    }
  }
}
