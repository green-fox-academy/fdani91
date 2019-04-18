package Animal;

public class Animal {

    int hunger;
    int thirst;

    public Animal() {

        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
}