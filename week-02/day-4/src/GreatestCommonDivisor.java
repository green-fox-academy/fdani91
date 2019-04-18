//Find the greatest common divisor of two numbers using recursion.

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(divisorFunction (49, 7));

    }

    public static int divisorFunction (int firstNumber, int secondNumber) {
        if (secondNumber == 0)
            return firstNumber;
        else {
            return divisorFunction(secondNumber, firstNumber % secondNumber);
        }
    }
}
