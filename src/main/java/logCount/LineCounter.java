package main.java.logCount;

import java.io.*;
import java.io.FileReader;


public class LineCounter {

    public static int countLines(File file) throws IOException {
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.chars().boxed().count() != 0 && !line.contains("//")){
                    counter++;
                }
            }
        }
        return counter;
    }
}
