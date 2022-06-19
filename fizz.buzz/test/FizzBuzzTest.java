import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FizzBuzzTest {
    @Test
    void testFizzBuzzWithDivideableBy5and3() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(15), "main.java.fizz.buzz.FizzBuzz");
    }

    @Test
    void testFizzBuzzWithDivideableBy3() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(21), "Fizz");
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(9), "Fizz");
    }

    @Test
    void testFizzBuzzWithDivideableBy5() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(20), "Buzz");
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(455), "Buzz");
    }

    @Test
    void testFizzBuzzNormal() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(22), "22");
    }
}
