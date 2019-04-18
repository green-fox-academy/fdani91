import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] arqs) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a number");
        int userInput1 = scan.nextInt();

        for (int sor = 1; sor <= userInput1 * 2; sor +=2)
        {
            for (int oszlop = 0; oszlop < (userInput1 - sor / 2); oszlop++)
            {
                System.out.print(" ");
            }
            for (int c = 0; c < sor; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
