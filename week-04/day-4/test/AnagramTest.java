import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram;

  @Before
  public void setup() {
    anagram = new Anagram();
  }

  @Test
  public void anagramTrue() {
    String inputWord_1 = "triangle";
    String inputWord_2 = "integral";

    boolean result = anagram.anagram(inputWord_1, inputWord_2);
    boolean expect = true;

    assertEquals(expect, result);
  }

  @Test
  public void anagramFalse() {
    String inputWord_1 = "triangle";
    String inputWord_2 = "priangle";

    boolean result = anagram.anagram(inputWord_1, inputWord_2);
    boolean expect = false;

    assertEquals(expect, result);
  }
}
