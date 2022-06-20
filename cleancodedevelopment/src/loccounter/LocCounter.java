package loccounter;

import java.io.IOException;

public class LocCounter {

	public static void main(String[] args) throws IOException {
		
		String filename = args[0];
		var lines = FileReader.readAllLines(filename).stream();
		var notEmptyLines = new EmptyLineFilter().filterLines(lines);
		var codeLines = new CommentLineFilter().filterLines(notEmptyLines);
		long count = LineCounter.count(codeLines);
		Printer.print(filename, count);
	}

}
