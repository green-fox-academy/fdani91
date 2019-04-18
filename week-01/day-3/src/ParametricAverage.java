import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        double num = 0;
        double db = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("please input a number");

        int numberOfNumbers = scan.nextInt();
        while (db <= numberOfNumbers)
        {
            System.out.println("Input number:");
            num += scan.nextInt();
            db += 1;
        }
        double average = (num / numberOfNumbers);
        int sum = (int) num;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
