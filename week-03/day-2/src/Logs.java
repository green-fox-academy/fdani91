// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        System.out.println(fileReaderFunction("log.txt"));
        System.out.println(Arrays.toString(uniqueIpFunction(fileReaderFunction("log.txt"))));
        System.out.println(ratioFunction(fileReaderFunction("log.txt")));
    }

    public static List<String> fileReaderFunction(String inputFileNameHere) {
        List<String> readTheFile = new ArrayList<>();
        Path filePath = Paths.get(inputFileNameHere);
        try {
            readTheFile = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("unable to read the given file");
        }
        return readTheFile;
    }

    private static String[] uniqueIpFunction(List<String> whatToSplit) {
        String[] uniqueIP = new String[whatToSplit.size()];

        for (String i : whatToSplit) {
            uniqueIP[whatToSplit.indexOf(i)] = i.substring(27, 38);
        }
        return uniqueIP;
    }

    private static double ratioFunction(List<String> getPostFile) {
        double get = 0;
        double post = 0;

        for (String i : getPostFile) {
            if (i.contains("GET")) {
                get++;
            } else {
                post++;
            }
        }
        return get / post;
    }
}