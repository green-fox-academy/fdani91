package newfleetofthings;

import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing getMilk = new Thing("Get milk");
    Thing removeObstacle = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Get lunch");
    getMilk.complete();
    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(removeObstacle);
    fleet.add(standUp);
    fleet.add(eatLunch);

    System.out.println(fleet);

    //TO SORT with COMPARABLE method first based on completion then based on name.
    Collections.sort(fleet.getThings());
    System.out.println(fleet);
  }
}
