package test.java.fizz.buzz;

import main.java.fizz.buzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzWithDivideableBy5and3() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(15), "FizzBuzz");
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(450), "FizzBuzz");
    }

    @Test
    public void testFizzBuzzWithDivideableBy3() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(21), "Fizz");
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(9), "Fizz");
    }

    @Test
    public void testFizzBuzzWithDivideableBy5() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(20), "Buzz");
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(455), "Buzz");
    }

    @Test
    public void testFizzBuzzNormal() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(22), "22");
    }
}
