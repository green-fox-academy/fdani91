import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        List<Integer> expenses = new ArrayList<>();

        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        double sum = 0;

        for (int i: expenses)
            sum = sum + i;

        System.out.println("We have spent in total: " + sum); //How much did we spend?

        System.out.println(Collections.max(expenses)); //Which was our greatest expense?

        System.out.println(Collections.min(expenses)); //Which was our cheapest spending?

        double average = sum / expenses.size();
        System.out.println(average);

    }
}
