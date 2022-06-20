package ch.markusborer.loccounter;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class CommentLineFilter {

    public static Stream<String> filterLines(Stream<String> lines) {
        Predicate<? super String> isNotCommentLine = line -> !line.trim().startsWith("//");
        return lines.filter(isNotCommentLine);
    }

}
