package test.java.fizz.buzz;

import main.java.fizz.buzz.FizzBuzzConveter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzConveterTest {
    @Test
    public void testFizzBuzzWithDivideableBy5and3() {
        assertEquals( "FizzBuzz", FizzBuzzConveter.convertFizzBuzzNumber(15));
        assertEquals("FizzBuzz", FizzBuzzConveter.convertFizzBuzzNumber(450));
    }

    @Test
    public void testFizzBuzzWithDivideableBy3() {
        assertEquals( "Fizz", FizzBuzzConveter.convertFizzBuzzNumber(21));
        assertEquals("Fizz", FizzBuzzConveter.convertFizzBuzzNumber(9));
    }

    @Test
    public void testFizzBuzzWithDivideableBy5() {
        assertEquals( "Buzz", FizzBuzzConveter.convertFizzBuzzNumber(20));
        assertEquals( "Buzz", FizzBuzzConveter.convertFizzBuzzNumber(455));
    }

    @Test
    public void testFizzBuzzNormal() {
        assertEquals(FizzBuzzConveter.convertFizzBuzzNumber(22), "22");
    }
}
