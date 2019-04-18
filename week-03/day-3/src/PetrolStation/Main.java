package PetrolStation;

public class Main {

    public static void main(String[] args) {

        Station shell = new Station();
        Car porsche = new Car();

        System.out.println(shell.gasAmount);
        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);

        System.out.println();

        shell.refill(porsche);

        System.out.println(shell.gasAmount);
        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);

    }
}
