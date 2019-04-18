// Program to find n-th stair
// using step size 1 or 2 or 3.
// Recursive method

public class Demo {
    public static void main(String[] args) {

        System.out.println(stepFunction(4));

    }
        // Returns count of ways to reach
        // n-th stair using 1 or 2 or 3 steps.
        public static int stepFunction(int n)
        {
            if (n <= 1)
                return 1;
            else if (n == 2)
                return 2;
            else
                return stepFunction(n - 3) + stepFunction(n - 2) + stepFunction(n - 1);
        }
}
