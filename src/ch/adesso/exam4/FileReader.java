package ch.adesso.exam4;

import java.io.File;

public class FileReader {
    public File readFile(String filename){
        return new File(filename);
    }
}
