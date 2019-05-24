// Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {

    String asd = "leagueoflegends";

    Map<String, Long> freq = Arrays.stream(asd.split(""))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(freq);

  }
}
