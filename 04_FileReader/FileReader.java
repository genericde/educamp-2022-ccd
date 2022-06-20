import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileRead {

    public static void main(String args[]) throws IOException {

        File file = FileCreator.createNewFile();
        FileReader fr = new FileReader(file);
        char [] a = new char[50];
        fr.read(a);
        for (char c : a)
        System.out.print(c);
        fr.close();
    }

}

