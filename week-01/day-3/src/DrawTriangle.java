import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("please input a number");
        int userInput1 = scanner.nextInt();

        for (int row = 1; row <= userInput1; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
