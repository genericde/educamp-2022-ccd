package fizz_buzz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FizzBuzzTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(new PrintStream(originalOut));
    }

    @Test
    void printFizzBuzz() {
        FizzBuzz.printFizzBuzz(5);
        String consoleContent = buildPrintLine("1")
                               + buildPrintLine("2")
                               + buildPrintLine("FIZZ")
                               + buildPrintLine("4")
                               + buildPrintLine("BUZZ");
        Assertions.assertEquals(consoleContent, outContent.toString());
    }

    @Test
    void printFizzBuzz_ThrowsErrorWithRangeBelow2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FizzBuzz.printFizzBuzz(1));
    }

    @Test
    void printFizzBuzz_ThrowsErrorWithNegativeRange() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FizzBuzz.printFizzBuzz(-20));
    }

    @Test
    void buildFizzBuzzLine() {
        Assertions.assertEquals("FIZZ", FizzBuzz.buildFizzBuzzLine(3));
        Assertions.assertEquals("FIZZ", FizzBuzz.buildFizzBuzzLine(9));
        Assertions.assertEquals("BUZZ", FizzBuzz.buildFizzBuzzLine(5));
        Assertions.assertEquals("BUZZ", FizzBuzz.buildFizzBuzzLine(10));
        Assertions.assertEquals("FIZZBUZZ", FizzBuzz.buildFizzBuzzLine(15));
        Assertions.assertEquals("7", FizzBuzz.buildFizzBuzzLine(7));
    }

    private String buildPrintLine(String text) {
        return text + System.lineSeparator();
    }
}
