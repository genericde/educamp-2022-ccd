package main.java.logCount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogCount {


    public static void main(String[] args) {
        try {
            InputReader inputReader = new InputReader();
            File file = FileReader.readFile("ressource/" + inputReader.readInput());
            int numberOfLines = 0;

            numberOfLines = LineCounter.countLines(file);
            LineCountPrinter.printFizzBuzzOutput(String.valueOf(numberOfLines));
        } catch (FileNotFoundException e) {
            System.out.println("Could not FInd File");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
