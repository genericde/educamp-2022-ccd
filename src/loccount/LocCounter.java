package loccount;

public class LocCounter {

	public static void printLoc(String filename) {
		var allLines = FileReader.readAllLines(filename);
		var nonEmptyLines = new EmptyLineFilter().filterLines(allLines);
		var codeLines = new CommentLineFilter().filterLines(nonEmptyLines);
		var count = LineCounter.countLine(codeLines);
		LocPrinter.print(count);
	}
}
