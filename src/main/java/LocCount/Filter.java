package LocCount;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static Stream<String> removeComments(Stream<String> lines) {
        return lines.filter(line -> !isSingleLineComment(line));
    }

    private static boolean isSingleLineComment(String line) {
        return line.trim().startsWith("//");
    }
    public static Stream<String> removeBlankLines(Stream<String> lines) {
        return lines.filter(line -> !line.isBlank());
    }

    public static List<String> filter(Stream<String> lines) {
        lines = removeBlankLines(lines);
        return removeComments(lines).collect(Collectors.toList());
    }
}
