import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> inputList) {
    int sum = 0;

    for (Integer numbers : inputList) {
      sum += numbers;
    }
    return sum;
  }
}
