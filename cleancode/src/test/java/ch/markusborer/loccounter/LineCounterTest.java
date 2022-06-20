package ch.markusborer.loccounter;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LineCounterTest {

    @Test
    void countLines() {
        Stream<String> lines = Stream.of("    ", "// dddd", "    //eee", "code1", "code2");
        long count = LineCounter.countLines(lines);
        assertEquals(5, count);
    }

    @Test
    void countLinesEmptyStream() {
        Stream<String> lines = Stream.of();
        long count = LineCounter.countLines(lines);
        assertEquals(0, count);
    }
}