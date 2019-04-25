package gardenapp;

public class Tree extends Plant {

  public Tree(String color) {
    super(color); //nem csak a colort-t hanem waterAmount 0;
    setNeedsWater(10);
  }
}
