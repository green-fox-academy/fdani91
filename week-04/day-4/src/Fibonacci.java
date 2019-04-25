// Write a function that computes a member of the fibonacci sequence by a given index
// Create tests for multiple test cases.
// Fn = Fn-1 + Fn-2

public class Fibonacci {

  public int fibonacciFunction(int index) {
    if (index <= 1) {
      return index;
    }
    return fibonacciFunction(index - 1) + fibonacciFunction(index - 2);
  }
}
