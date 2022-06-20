package loccounter;

import java.util.stream.Stream;

public class EmptyLineFilter {
  
	public Stream<String> filterLines(Stream<String> lines) {
	  return lines.filter(this::isNotEmpty);
    }
  
	public boolean isNotEmpty(String line) {
	  return !line.trim().isEmpty();
	}
}
