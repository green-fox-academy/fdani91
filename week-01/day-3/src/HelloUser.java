import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name then press Enter");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

    }
}