// Write a Stream Expression to find the uppercase characters in a string!

import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {

    String asd = "DaNieL";

    asd.chars() // !!!!!!!!!!
        .filter(Character::isUpperCase)
        .mapToObj(c -> Character.toString((char) c))
        .forEach(System.out::print);
  }
}
