package gardenapp;

public class Main {
  public static void main(String[] args) {

    Flower yellow = new Flower("yellow");
    Flower blue = new Flower("blue");
    Tree purple = new Tree("purple");
    Tree orange = new Tree("orange");

    Garden garden = new Garden();
    garden.addPlant(yellow);
    garden.addPlant(blue);
    garden.addPlant(purple);
    garden.addPlant(orange);
    
    System.out.println();
    garden.watering(0);
    System.out.println();
    garden.watering(40);
    System.out.println();
    garden.watering(70);
  }
}
