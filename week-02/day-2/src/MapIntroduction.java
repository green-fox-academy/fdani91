import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {

        HashMap<Integer, Character> ASD = new HashMap<>();
        System.out.println(ASD.isEmpty());

        ASD.put(97, 'a');
        ASD.put(98, 'b');
        ASD.put(99, 'c');
        ASD.put(65, 'A');
        ASD.put(66, 'B');
        ASD.put(67, 'C');

        System.out.println(ASD.keySet()); //Print all the keys
        System.out.println(ASD.values()); //Print all the values

        ASD.put(68, 'D');

        System.out.println(ASD.size()); //Print how many key-value pairs are in the map

        System.out.println(ASD.get(99)); //Print the value that is associated with key 99

        ASD.remove(97);
        System.out.println(ASD); //Remove the key-value pair where with key 97

        System.out.println(ASD.get(100)); //Print whether there is an associated value with key 100 or not

        ASD.clear();
        System.out.println(ASD); //Remove all the key-value pairs
    }
}
