package loccount;

import java.util.stream.Stream;

abstract class AbstractLineFilter {

	abstract boolean isCode(String line);
	
	final Stream<String> filterLines(Stream<String> lines) {
		return lines.filter(this::isCode);
	}
}
