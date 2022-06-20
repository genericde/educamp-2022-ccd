package linecount;

import java.io.File;

public class Filefinder {

    public File checkFilePath(String name){
   File file = new File("/home/julian/projects/educamp-2022-ccd/src/main/java/linecount" + name + ".txt");
   return file;
    }

}
