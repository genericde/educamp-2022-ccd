package loc_count;

import java.util.stream.Stream;

public class LocCountFilter {
  static Stream<String> filterLines(Stream<String> lines) {
    return lines.filter((String line) -> {
      return !isEmpty(line) && !isComment(line);
    });
  }

  private static boolean isComment(String line) {
    return line.substring(0, 1).equals("//");
  }

  private static boolean isEmpty(String line) {
    return line.trim().length() == 0;
  }
}
