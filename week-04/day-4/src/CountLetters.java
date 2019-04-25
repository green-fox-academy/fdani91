// Write a function, that takes a string as an argument and returns a dictionary with all letters in
// the string as keys, and numbers as values that shows how many occurrences there are.
// Create a test for that.

import java.util.HashMap;

public class CountLetters {

  public HashMap countLettersFunction(String string) {
    HashMap<Character, Integer> result = new HashMap<>();

    for (int i = 0; i < string.length(); i++) {
      if (!result.containsKey(string.charAt(i))) { //PAY ATTENTION TO THE ! MARK. In order to negate/doesn't contain.
        result.put(string.charAt(i), 0);
      }
      result.put(string.charAt(i), result.get(string.charAt(i)) + 1);
    }
    return result;
  }
}
