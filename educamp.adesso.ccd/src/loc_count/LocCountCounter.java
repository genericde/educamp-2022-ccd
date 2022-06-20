package loc_count;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocCountCounter {
  static long countLines(Stream<String> filteredLines) {
    return filteredLines.count();
  }
}
