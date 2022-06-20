package ch.markusborer.loccounter;

import java.io.IOException;
import java.util.stream.Stream;

// This is a comment
public class LocCounter {

    // This is the count-method
    public static void countLoc(String fileName) {
        try {
            Stream<String> lines = FileReader.readAllLines(fileName);
            lines = EmptyLineFilter.filterLines(lines);
            lines = CommentLineFilter.filterLines(lines);
            long count = LineCounter.countLines(lines);
            LocPrinter.print(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This is the main-method
    public static void main(String[] args) {
        LocCounter.countLoc("C:\\Projects\\educamp-2022-ccd\\cleancode\\src\\main\\java\\ch\\markusborer\\loccounter\\LocCounter.java");
    }

}
