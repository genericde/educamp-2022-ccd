package ch.markusborer.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21})
    public void convertShouldReturnFizz(int value) {
        assertEquals("Fizz", new FizzBuzz().convert(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40})
    public void convertShouldReturnBuzz(int value) {
        assertEquals("Buzz", new FizzBuzz().convert(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void convertShouldReturnFizzBuzz(int value) {
        assertEquals("FizzBuzz", new FizzBuzz().convert(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11})
    public void convertShouldReturnNumber(int value) {
        assertEquals(String.valueOf(value), new FizzBuzz().convert(value));
    }

    /*
    @Test
    void showNumbersFrom1To100() {
        TestStream testStream = new TestStream(System.out);
        System.setOut(testStream);
        new FizzBuzz().showNumbersFrom1To100();
        assertEquals(100, testStream.i);
    }
     */

    private static class TestStream extends PrintStream {

        int i = 0;

        public TestStream(OutputStream out) {
            super(out);
        }

        public void print(String text) {
            super.print(text);
            i++;
        }
    }
}