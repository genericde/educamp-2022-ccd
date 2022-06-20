package ch.adesso.exam4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {

    public int countLines(File file){
        int count = 0;
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(line.isBlank()){

                }
                else if (line.startsWith("//")){

                }
                else {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
