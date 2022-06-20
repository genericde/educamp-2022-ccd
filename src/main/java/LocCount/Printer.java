package LocCount;

import java.io.PrintStream;

public class Printer {
    private final PrintStream printStream;

    public Printer(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(String label, int number) {
        this.printStream.println(label + ": " + number);
    }
}
