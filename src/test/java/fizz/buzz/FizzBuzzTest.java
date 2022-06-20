package test.java.fizz.buzz;

import main.java.fizz.buzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzWithDivideableBy5and3() {
        assertEquals( "FizzBuzz", FizzBuzz.convertFizzBuzzNumber(15));
        assertEquals("FizzBuzz", FizzBuzz.convertFizzBuzzNumber(450));
    }

    @Test
    public void testFizzBuzzWithDivideableBy3() {
        assertEquals( "Fizz", FizzBuzz.convertFizzBuzzNumber(21));
        assertEquals("Fizz", FizzBuzz.convertFizzBuzzNumber(9));
    }

    @Test
    public void testFizzBuzzWithDivideableBy5() {
        assertEquals( "Buzz", FizzBuzz.convertFizzBuzzNumber(20));
        assertEquals( "Buzz", FizzBuzz.convertFizzBuzzNumber(455));
    }

    @Test
    public void testFizzBuzzNormal() {
        assertEquals(FizzBuzz.convertFizzBuzzNumber(22), "22");
    }
}
