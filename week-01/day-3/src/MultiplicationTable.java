import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45

        int a;

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please input a number to see multiplication table");
        a = inputNumber.nextInt();

        int b;

        for (b = 1; b <= 20; b++) {
            System.out.println(b + " * " + a + " = " + (b * a));
        }

    }
}
