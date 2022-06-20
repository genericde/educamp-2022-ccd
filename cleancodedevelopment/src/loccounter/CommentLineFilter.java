package loccounter;

import java.util.stream.Stream;

public class CommentLineFilter {
  
	public Stream<String> filterLines(Stream<String> lines) {
	  return lines.filter(this::isNotComment);
  }
  
  boolean isNotComment(String line) {
	  return !line.trim().startsWith("//");
  }
}
