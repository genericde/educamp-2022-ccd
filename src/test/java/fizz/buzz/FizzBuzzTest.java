package test.java.fizz.buzz;

import main.java.fizz.buzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzWithDivideableBy5and3() {
        assertEquals( "FizzBuzz", FizzBuzz.replaceIfFizzBuzzNumber(15));
        assertEquals("FizzBuzz", FizzBuzz.replaceIfFizzBuzzNumber(450));
    }

    @Test
    public void testFizzBuzzWithDivideableBy3() {
        assertEquals( "Fizz", FizzBuzz.replaceIfFizzBuzzNumber(21));
        assertEquals("Fizz", FizzBuzz.replaceIfFizzBuzzNumber(9));
    }

    @Test
    public void testFizzBuzzWithDivideableBy5() {
        assertEquals( "Buzz", FizzBuzz.replaceIfFizzBuzzNumber(20));
        assertEquals( "Buzz", FizzBuzz.replaceIfFizzBuzzNumber(455));
    }

    @Test
    public void testFizzBuzzNormal() {
        assertEquals(FizzBuzz.replaceIfFizzBuzzNumber(22), "22");
    }
}
