package ch.markusborer.loccounter;

import org.junit.jupiter.api.Test;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LocPrinterTest {

    @Test
    void print() {
        TestStream testStream = new TestStream(System.out);
        System.setOut(testStream);
        LocPrinter.print(13);
        assertEquals("LOC: 13", testStream.output);
    }

    private static class TestStream extends PrintStream {

        String output = "";

        public TestStream(OutputStream out) {
            super(out);
        }

        public void print(String text) {
            output += text;
        }
    }
}