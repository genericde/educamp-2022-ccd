package loccounter;

import java.util.stream.Stream;

public class LineCounter {
	
	public static long count(Stream<String> lines) {
		return lines.count();
	}

}
