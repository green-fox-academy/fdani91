// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1,3,5,6,7));
    }

    public static int sum(int... numbers)
    {
        int result = 0;
        for (int i =  0; i < numbers.length; i++)
        {
            result += numbers[i];
        }
        return result;
    }
}