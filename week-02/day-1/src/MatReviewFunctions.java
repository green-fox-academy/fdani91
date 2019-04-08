 public class MatReviewFunctions {
    public static void main(String[] args) {
        int[] arr = new int[10];
        sum(1, 2); // we need to call the sum method/function in order to see it printed out
        int result = sumWithReturn(5, 5); //without using void below. See difference.
        System.out.println(result);
        int SUM = addElements(arr);

        for(int i = 0; i < 10; i++) //not to repeat yourself in programming.
        {
            arr[i] = i;
        }
    }
    public static void sum(int a, int b) //sum method/function.
    {
        System.out.println(a + b);
    }
    public static int sumWithReturn(int a, int b) //without using void
    {
        return a + b;
    }
    public static int addElements(int[] array)
    {
        int sum = 0;
        for (int i: array)
        {
            sum += i;
        }
        return sum;
    }
}