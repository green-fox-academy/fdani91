import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner userInputFirst = new Scanner(System.in);

        int a;

        System.out.println("Please input your First Number");
        a = userInputFirst.nextInt();

        Scanner userInputSecond = new Scanner(System.in);

        int b;

        System.out.println("Please input your Second Number");
        b = userInputSecond.nextInt();

        if (b <= a) {
            System.out.println("The second number should be bigger");
        }
        for (a = a; b > a;  a++) {
            System.out.println(a);
        }

    }
}
