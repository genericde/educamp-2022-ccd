package loc_count;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class LocCountReader {
  static Stream<String> readFile(String filename) {
    try {
      File file = new File(filename);
      Path filePath = Path.of(file.toURI());
      return Files.lines(filePath);
    // } catch (URISyntaxException e) {
    //   System.out.println("Invalid file path");
    //   throw new RuntimeException("Invalid file path", e);
    } catch (IOException e) {
      System.out.println("Error opening the file");
      throw new RuntimeException("Error opening the file", e);
    }
  }
}
