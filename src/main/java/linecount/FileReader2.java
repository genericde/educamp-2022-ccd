package linecount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

    public Integer readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/julian/projects/educamp-2022-ccd/src/main/java/linecount/input.txt"));
        Integer lineCounter = 0;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
               if  (!line.isEmpty() && !line.startsWith("#")){
                   lineCounter = lineCounter + 1;
               }

                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
        return lineCounter;
    }
}
