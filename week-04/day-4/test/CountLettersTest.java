import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  private CountLetters dictionary;

  @Before
  public void setup() {
    dictionary = new CountLetters();
  }

  @Test
  public void testCountLetter() {
    assertEquals(4, dictionary.countLettersFunction("ZzzzZZZ").get('Z'));
  }
}
