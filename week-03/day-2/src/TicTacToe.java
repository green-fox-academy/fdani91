import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        List<String> content = Files.readAllLines(filePath);

        char[][] chars = new char[3][3];
        chars[0] = content.get(0).toCharArray();
        chars[1] = content.get(1).toCharArray();
        chars[2] = content.get(2).toCharArray();

        if ((chars[1][1] == chars[0][0] && chars[1][1] == chars[2][2]) || //átlókat nézi
                (chars[1][1] == chars[0][2] && chars[1][1] == chars[2][0])) {
            return String.valueOf(chars[1][1]);
        }

        for (int i = 0; i < 3; i++) { // eloszor sorok aztan oszlpok
            for (int j = 0; j < 3; j++) {
                if (chars[i][0] == chars[i][1] && chars[i][0] == chars[i][2]) {
                    return String.valueOf(chars[i][0]);
                } else if (chars[0][j] == chars[1][j] && chars[0][j] == chars[2][j]) {
                    return String.valueOf(chars[j][0]);
                }
            }
        }
        return "draw"; // Draw
    }
}