package LocCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Stream;

public class LocCount {
    public static void run(String filename) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));

            Stream<String> parsedLines = fileReader.lines();

            List<String> filteredLines = Filter.filter(parsedLines);

            int count = Counter.count(filteredLines);

            new Printer(System.out).print("Lines of code", count);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File: " + filename + " does not exist.");
        }
    }
}
