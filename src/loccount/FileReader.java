package loccount;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

class FileReader {

	static Stream<String> readAllLines(String filename) {
		try {
			var filepath = Path.of(filename);
			return Files.readAllLines(filepath).stream();
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}
