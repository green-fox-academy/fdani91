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

        int how_many;

        Scanner userInput = new Scanner(System.in);

        System.out.println("please input a number");
        how_many = userInput.nextInt();

        for (int a = 1; a <= how_many; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
