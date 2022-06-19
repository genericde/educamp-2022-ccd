package fizz_buzz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

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

    private String invokeMethode(String methodName, Class<?> argClasses) {
        Method method = null;
        try {
            method = FizzBuzz.class.getDeclaredMethod(methodName, argClasses);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Methode: " + methodName + " does not exist, with arguments: " + argClasses.toString());
        }
        method.setAccessible(true);
        return method.invoke(targetObject, argObjects);
    }

    private String buildPrintLine(String text) {
        return text + System.lineSeparator();
    }
}
