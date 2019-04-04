import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        double kilometers;

        Scanner inputtedKm = new Scanner(System.in);

        System.out.println("Please input a distance in kilometer and I'll convert it to mile");
        kilometers = inputtedKm.nextDouble();

        double miles = kilometers * 0.621;

        System.out.println(miles + " Miles");

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}