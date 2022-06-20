package ch.markusborer.loccounter;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmptyLineFilter {

    public static Stream<String> filterLines(Stream<String> lines) {
        Predicate<? super String> isNotEmptyLine = line -> line.trim().length() > 0;
        return lines.filter(isNotEmptyLine);
    }

}
