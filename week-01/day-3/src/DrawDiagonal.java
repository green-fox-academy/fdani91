import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("Please insert your number");
        Scanner scanner = new Scanner(System.in);
        int userInput =  scanner.nextInt();

        for (int r = 0; r < userInput; r++) {

            // Loop denoting columns
            for (int c = 0; c < userInput; c++) {

                // Checking boundary conditions
                // and main diagonal and
                // secondary diagonal conditions
                if (r == 0 || c == 0 || r == c
                        || r == userInput - 1 || c == userInput - 1)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
