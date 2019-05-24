// Write a Stream Expression to concatenate a Character list to a string!

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {

    List<Character> letters = Arrays.asList('D', 'a', 'n', 'i');

    String result = letters.stream()
            .map(Object::toString)
            .collect(Collectors.joining());
    System.out.println(result);
  }
}
