import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 5 numbers in a row");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        int userInput4 = scanner.nextInt();
        int userInput5 = scanner.nextInt();

        int sum = (userInput1 + userInput2 + userInput3 + userInput4 + userInput5);
        int average = ((userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5);

        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
