//We have a number of bunnies and each bunny has two big floppy ears.
//We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(earsFunction(2));

    }
    public static int earsFunction (int bunny) {
        if (bunny <= 0)
            return 0;
        else {
            return 2 + earsFunction(bunny - 1); //nyulak számát mindig csökkentse 1-el és adja össze, amíg nem lesz nulla
        }
    }
}
