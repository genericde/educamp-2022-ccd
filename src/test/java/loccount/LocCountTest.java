package test.java.loccount;

import main.java.fizz.buzz.FizzBuzzConveter;
import main.java.logCount.FileReader;
import main.java.logCount.LineCounter;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LocCountTest {


    @Test
    public void testJavaFileReading() throws IOException {
        File file = FileReader.readFile("FizzBuzz.java");
        assertNotNull(file);
        assertEquals(24, LineCounter.countLines(file));
    }

    @Test
    public void testEmptyFileReading() throws IOException {
        File file = FileReader.readFile("testFile.txt");
        assertNotNull(file);
        assertEquals(0, LineCounter.countLines(file));
    }

    @Test(expected = FileNotFoundException.class)
    public void testNonExistingReading() throws IOException {
        FileReader.readFile("nonexisting.file");
    }
}
