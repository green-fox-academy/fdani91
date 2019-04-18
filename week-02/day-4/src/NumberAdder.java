//Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdderFunction(5));

    }

    public static int numberAdderFunction(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + numberAdderFunction(n-1);
        }
    }
}
