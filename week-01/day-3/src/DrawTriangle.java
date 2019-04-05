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
        int how_many = scanner.nextInt();

        for (int a = 1; a <= how_many; a++)
        {
            for (int b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
