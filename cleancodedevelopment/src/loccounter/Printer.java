package loccounter;

public class Printer {

	public static void print(String filename, long count) {
		formatMessage(filename, count);
	}

	private static void formatMessage(String filename, long count) {
		System.out.println("File: " + filename);
		System.out.println("Code lines: " + count);
	}
}
