import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  Sum object;
  ArrayList<Integer> inputList = new ArrayList<>();

  @Before
  public void setup() {

    object = new Sum();
  }

  @Test
  public void sumTest() {

    inputList.add(1);
    inputList.add(2);
    inputList.add(3);
    inputList.add(4);
    inputList.add(5);
    assertEquals(15, object.sum(inputList));
  }

  @Test
  public void sumEmptyListTest() {
    assertEquals(0, object.sum(inputList));
  }

  @Test
  public void sumOneElementTest() {
    inputList.add(5);
    assertEquals(5, object.sum(inputList));
  }
}
