package test.java.fizz.buzz;

import main.java.fizz.buzz.FizzBuzzConveter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzConveterTest {
    @Test
    public void testFizzBuzzWithDivideableBy5and3() {
        assertEquals( "FizzBuzz", FizzBuzzConveter.convertNumber(15));
        assertEquals("FizzBuzz", FizzBuzzConveter.convertNumber(450));
    }

    @Test
    public void testFizzBuzzWithDivideableBy3() {
        assertEquals( "Fizz", FizzBuzzConveter.convertNumber(21));
        assertEquals("Fizz", FizzBuzzConveter.convertNumber(9));
    }

    @Test
    public void testFizzBuzzWithDivideableBy5() {
        assertEquals( "Buzz", FizzBuzzConveter.convertNumber(20));
        assertEquals( "Buzz", FizzBuzzConveter.convertNumber(455));
    }

    @Test
    public void testFizzBuzzNormal() {
        assertEquals(FizzBuzzConveter.convertNumber(22), "22");
        assertEquals(FizzBuzzConveter.convertNumber(1111), "1111");
    }
}
