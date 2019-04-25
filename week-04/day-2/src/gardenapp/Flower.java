package gardenapp;

public class Flower extends Plant {

  public Flower(String color) {
    super(color); //nem csak a colort-t hanem waterAmount 0;
    setNeedsWater(5);
  }
}
