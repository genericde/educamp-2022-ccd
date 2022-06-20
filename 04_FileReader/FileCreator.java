import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/20/2022
 */
public class FileCreator {

    static File createNewFile() throws IOException {
        File file = new File("TestFile.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("This\n is\n a\n test\n");
        writer.flush();
        writer.close();

        return file;
    }

}
