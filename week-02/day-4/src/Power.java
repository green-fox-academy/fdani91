//Given base and n that are both 1 or more,
// compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(powerFunction(5, 0));

    }
    public static int powerFunction (int base, int nPower) {
        if (nPower == 0) { //ha az kitevő nulla akkor 1 az eredmény. Base case
            return 1;
        } else {
            return base * powerFunction(base, nPower-1);
        }
    }
}
