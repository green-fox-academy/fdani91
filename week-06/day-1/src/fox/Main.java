// Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
// Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color, and age less then 5 years!
// Write a Stream Expression to find the frequency of foxes by color!

package fox;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    Fox fox1 = new Fox("Róka1", "Green", 1);
    Fox fox2 = new Fox("Róka2", "Green", 8);
    Fox fox3 = new Fox("Róka3", "Red", 3);
    Fox fox4 = new Fox("Róka4", "Yellow", 4);
    Fox fox5 = new Fox("Róka5", "Blue", 9);

    List<Fox> foxes = Arrays.asList(fox1, fox2, fox3, fox4, fox5);

    System.out.println("Write a Stream Expression to find the foxes with green color!");
    foxes.stream()
        .filter(fox -> fox.getColor().equals("Green"))
        .forEach(fox -> System.out.println(fox.getName()));

    System.out.println(
        "Write a Stream Expression to find the foxes with green color, and age less then 5 years!");
    foxes.stream()
        .filter(fox -> fox.getColor().equals("Green"))
        .filter(fox -> fox.getAge() < 5)
        .forEach(fox -> System.out.println(fox.getName()));

    System.out.println("Write a Stream Expression to find the frequency of foxes by color!");
    Map<String, Long> colorFreq =
        foxes.stream().collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));

    System.out.println(colorFreq);
  }
}
