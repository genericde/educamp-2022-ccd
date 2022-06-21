package ch.adesso.educamp.filereader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
public class LocCounter {
    public static void countLoc(String filename) throws IOException {
        Path file = readFile(filename);
        List<String> parsed = parse(file);
        List<String> codeLines = filter(parsed);
        int numberOfLines = codeLines.size();
        print(numberOfLines);
    }
    private static Path readFile(final String fileName) {
        Path path = Paths.get(fileName);  // ex. src/main/java/ch/adesso/educamp/filereader/LocCounter.java
        return path;
    }
    private static List<String> parse(Path path) throws IOException {
        List<String> readLines = Files.readAllLines(path);
        return readLines;
    }
    private static List<String> filter(List<String> allLines) {
        List<String> codeLines = allLines.stream().filter(l ->
                !"".equals(l) && !startsWithDoubleSlash(l))
                .collect(Collectors.toList());
        return codeLines;
    }
    private static boolean startsWithDoubleSlash(String l) {
        // TODO improve, with comments at indented lines this not working
        return '/' == l.toCharArray()[0] && '/' == l.toCharArray()[1];
    }
    private static void print(int numberOfLines) {
        System.out.println("code lines: " + numberOfLines);
    }
}