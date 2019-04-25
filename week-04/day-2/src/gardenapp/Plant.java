package gardenapp;

public class Plant {

  private String color;
  private double waterAmount;
  private double needsWater;

  public Plant() {

  }

  public Plant(String color) {
    setColor(color);
    setWaterAmount(0);
  }

  public void getCurrentStatus() {
    if (getWaterAmount() < getNeedsWater()) {
      System.out.println("The " + getColor() + " " + getClass().getSimpleName() + " needs water.");
    } else {
      System.out.println(
          "The " + getColor() + " " + getClass().getSimpleName() + " doesn't need water.");
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount = waterAmount;
  }

  public double getNeedsWater() {
    return needsWater;
  }

  public void setNeedsWater(double needsWater) {
    this.needsWater = needsWater;
  }
}
