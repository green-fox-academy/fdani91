import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size()); //Print out the number of elements in the list

        names.add("William");
        System.out.println(names.isEmpty()); //Print out whether the list is empty or not

        names.add("John");
        names.add("Amanda");
        System.out.println(names.size()); //Print out the number of elements in the list

        System.out.println(names.get(2)); //Print out the 3rd element

        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i)); //Iterate through the list and print out each name
        }

        int index = 1;
        for (String s : names)
        {
            System.out.println((index++) +". " +s); //Iterate through the list and print with numbers 1.2.3.
        }

        names.remove(1); //Remove the 2nd element
        System.out.println(names);

        for (int j = names.size() - 1; j >= 0; j--)
        {
            System.out.println(names.get(j)); //Iterate through the list in a reversed order and print out each name
        }
        names.clear();
        System.out.println(names); //Remove all elements
    }
}
