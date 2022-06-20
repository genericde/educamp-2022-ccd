package loc_count;

import java.util.stream.Stream;

public class LocCount {
  static public void doLocCount(String filename) {
    Stream<String> lines = LocCountReader.readFile(filename);
    Stream<String> filteredLines = LocCountFilter.filterLines(lines);
    long lineCount = LocCountCounter.countLines(filteredLines);
    LocCountPrinter.printLineCount(lineCount);
  }
}
