import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        int a;

        Scanner inputtedNumber = new Scanner(System.in);

        System.out.println("Please enter a number and I'll check if it's Odd or Even");
        a = inputtedNumber.nextInt();

        if (a % 2 == 0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }



    }
}