import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner userInput = new Scanner(System.in);

        int answer = 10;
        int guess;
        System.out.println("Guess the number");
        do {
            guess = userInput.nextInt();
            {
                if (guess == answer)
                {
                } else if (guess > answer)
                {
                    System.out.println("The stored number is Lower");
                } else if (guess < answer)
                {
                    System.out.println("The stored number is Higher");
                }
            }
        } while (guess != answer);

        System.out.println("You found the number: " + answer);

    }
}