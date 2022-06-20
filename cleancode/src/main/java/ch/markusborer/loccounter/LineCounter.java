package ch.markusborer.loccounter;

import java.util.stream.Stream;

public class LineCounter {

    public static long countLines(Stream<String> lines) {
        return lines.count();
    }

}
