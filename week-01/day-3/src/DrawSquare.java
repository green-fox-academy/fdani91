import java.util.Scanner;

public class DrawSquare {
    public static void main (String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a number");
        int userInput = scan.nextInt();

        for (int sor = 1; sor <= userInput; sor++)
        {
            for (int oszlop = 1; oszlop <= userInput; oszlop++)
            {
                if (sor == 1 || oszlop == 1 || sor == userInput || oszlop == userInput)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
