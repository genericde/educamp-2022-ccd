package loccount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

class LocCounterTest {

	@Test
	void runLocCounterWithEmptyFile() throws IOException {
		Path filepath = Files.createTempFile("empty", ".txt");
		LocCounter.printLoc(filepath.toString());
	}
}
