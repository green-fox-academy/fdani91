import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        singleLineFunction("Daniel Fodor");

    }
    public static void singleLineFunction(String inputLineHere) {
        List<String> content = new ArrayList();
        content.add(inputLineHere);

        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);// write to file
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}