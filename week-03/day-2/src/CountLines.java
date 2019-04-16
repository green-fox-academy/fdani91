// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        countLinesFunction("my-file.txt");
    }

    public static void countLinesFunction(String inputFileNameHere) {
        try {
            Path filePath = Paths.get(inputFileNameHere);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.size()); // Return numbers of lines
        } catch (Exception e) {
            System.out.println("0");
        }
    }
}
