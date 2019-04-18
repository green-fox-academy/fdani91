package Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {

    ArrayList<Animal> animals;
    int slots;

    public Farm() {

        animals = new ArrayList<>();
        slots = 10;
    }

    public void add(Animal animal) {

        animals.add(animal);
    }

    public void breed() {

        if (slots > 0) {
            Animal animal = new Animal();
            animals.add(animal);
            slots--;
        }
    }

    public void slaughter() {

        int maxHunger = 0;
        int maxIndex = 0;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getHunger() > maxHunger) {
                maxHunger = animals.get(i).getHunger();
                maxIndex = i;
            }
        }
        animals.remove(maxIndex);
    }
}
