package ch.markusborer.loccounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReader {

    public static Stream<String> readAllLines(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName)).stream();
    }
}
