package loccount;

import java.util.stream.Stream;

class LineCounter {

	static long countLine(Stream<String> lines) {
		return lines.count();
	}
}
