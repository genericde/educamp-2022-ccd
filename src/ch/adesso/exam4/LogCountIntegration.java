package ch.adesso.exam4;

import java.io.File;

public class LogCountIntegration {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        LineCounter lineCounter = new LineCounter();
        Printer printer = new Printer();

        File file = fileReader.readFile("text.txt");
        int numberOfLines = lineCounter.countLines(file);
        printer.print(numberOfLines);
    }
}
