import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        System.out.println(reverseLinesFunction("reversed-lines.txt"));

    }

    public static List<String> reverseLinesFunction(String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> readTheFile = new ArrayList<>();
        try {
            readTheFile = Files.readAllLines(filePath);
            for (int i = 0; i < readTheFile.size(); i++) {
                StringBuilder reversedLines = new StringBuilder(readTheFile.get(i));
                reversedLines.reverse();
                readTheFile.set(i, reversedLines.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read the file");
        }
        return readTheFile;
    }
}