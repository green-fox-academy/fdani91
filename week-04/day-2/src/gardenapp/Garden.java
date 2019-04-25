package gardenapp;

import java.util.ArrayList;

public class Garden {
  private ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void watering(double water) {
    double waterShare = water / howManyNeedsWater();
    System.out.println("Watering with " + (int) water);
    for (Plant plant : plants) {
      if (plant instanceof Flower && plant.getWaterAmount() < 5) {
        plant.setWaterAmount(plant.getWaterAmount() + waterShare * 0.75);
      } else if (plant instanceof Tree && plant.getWaterAmount() < 10) {
        plant.setWaterAmount(plant.getWaterAmount() + waterShare * 0.4);
      }
      plant.getCurrentStatus();
    }
  }

  public double howManyNeedsWater() {
    double thirstyPlants = 0;
    for (Plant plant : plants) {
      if (plant.getWaterAmount() < plant.getNeedsWater()) {
        thirstyPlants++;
      }
    }
    return thirstyPlants;
  }
}
