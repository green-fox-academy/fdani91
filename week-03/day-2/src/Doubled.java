import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        System.out.println(removeDuplicates("duplicated-chars.txt"));

    }

    public static List<String> removeDuplicates(String location) {
        Path filePath = Paths.get(location);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(filePath);
            for (int i = 0; i < content.size(); i++) {
                StringBuilder decryptedLine = new StringBuilder(content.get(i));
                for (int j = 0; j < decryptedLine.length(); j++) {
                    if (decryptedLine.charAt(j) == decryptedLine.charAt(j + 1)) {
                        decryptedLine.deleteCharAt(j + 1);
                    }
                    content.set(i, decryptedLine.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to read file.");
        }
        return content;
    }
}