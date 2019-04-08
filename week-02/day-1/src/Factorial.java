//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorio(6));
    }
    public static int factorio(int a)
    {
        int result = 1;
        for (int factor = 2; factor <= a; factor++)
        {
            result *= factor;
        }
        return result;
    }
}
