import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two numbers");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println(userInput1);
        }
        else if (userInput2 > userInput1) {
            System.out.print(userInput2);
        }
        else {
            System.out.println("The two numbers are equal");
        }

    }
}
