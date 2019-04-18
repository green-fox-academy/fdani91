//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunnyEars(2));

    }

    public static int bunnyEars (int bunnies) {
        if (bunnies <= 0)
            return 0;
        else if (bunnies % 2 ==0) {
            return 3 + bunnyEars(bunnies - 1);
        }
        else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }
}
