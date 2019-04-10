import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>();
        listB.addAll(listA);

        if(listA.contains("Durian"))
        {
            System.out.println("List A contains Durian"); //Print out whether List A contains Durian or not
        }

        listB.remove("Durian");
        System.out.println(listB); //Remove Durian from List B

        listA.add(4, "Kiwifruit");
        System.out.println(listA); //Add Kiwifruit to List A after the 4th element

        System.out.println(listA.equals(listB)); //Compare the size of List A and List B

        System.out.println(listA.indexOf("Avocado")); //Get the index of Avocado from List A

        System.out.println(listB.indexOf("Durian")); //Get the index of Durian from List B

        String[] passionKiwi = {"Passion Fruit", "Kiwi"};

        for(int i =  0; i < passionKiwi.length; i++)
        {
            listB.add(passionKiwi[i]);
        }
        System.out.println(listB); //Add Passion Fruit and Pummelo to List B in a single statement

        System.out.println(listA.get(2)); //Print out the 3rd element from List A
    }
}
