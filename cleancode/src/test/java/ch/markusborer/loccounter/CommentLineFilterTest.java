package ch.markusborer.loccounter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CommentLineFilterTest {

    @ParameterizedTest
    @ValueSource(strings = {"//   ", "    //"})
    public void testCommentLines(String line) {
        Stream<String> lines = Stream.of(line);
        List<String> filterLines = CommentLineFilter.filterLines(lines).collect(Collectors.toList());
        assertEquals(0, filterLines.size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"   ", "code", "code//"})
    public void testNotCommentLines(String line) {
        Stream<String> lines = Stream.of(line);
        List<String> filterLines = CommentLineFilter.filterLines(lines).collect(Collectors.toList());
        assertEquals(1, filterLines.size());
        assertEquals(line, filterLines.get(0));
    }
}