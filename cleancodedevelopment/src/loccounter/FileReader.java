package loccounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
	public static List<String> readAllLines(String filename) throws IOException {
		return Files.readAllLines(Path.of(filename));
	}
}
