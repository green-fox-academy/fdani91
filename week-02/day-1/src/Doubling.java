// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class Doubling {

    static int baseNum =123;

    public static void main(String[] args) {
        doubling();
    }

    public static void doubling()
    {
        System.out.println(baseNum * 2);
    }
}