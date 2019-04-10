import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapIntroduction2 {
    public static void main(String[] args) {

        HashMap<String, String> WOW = new HashMap<>();

        WOW.put("978-1-60309-452-8", "A Letter to Jo");
        WOW.put("978-1-60309-459-7", "Lupus");
        WOW.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        WOW.put("978-1-60309-461-0", "The Lab");

        List keys = new ArrayList();
        keys.addAll(WOW.keySet());
        List values = new ArrayList();
        values.addAll(WOW.values());

        for (int i = 0; i < 4; i++) {
            System.out.println(values.get(i) + "(ISBN: " + keys.get(i) + ")");
        }

        WOW.remove("978-1-60309-444-3"); //Remove the key-value pair with key 978-1-60309-444-3
        System.out.println(WOW);

        WOW.values().remove("The Lab"); //Remove the key-value pair with value The Lab
        System.out.println(WOW);

        WOW.put("978-1-60309-450-4", "They Called Us Enemy"); //Add the following key-value pairs to the map
        WOW.put("978-1-60309-453-5", "Why Did We Trust Him?"); //Add the following key-value pairs to the map

        if (WOW.containsKey(478 - 0 - 61159 - 424 - 8)) //Print whether there is an associated value with key 478-0-61159-424-8 or not
        {
            System.out.println("WOW contains 478-0-61159-424-8");
        } else {
            System.out.println("WOW doesn't contain 478-0-61159-424-8");
        }

        System.out.println(WOW.get("978-1-60309-453-5")); //Print the value associated with key 978-1-60309-453-5
    }
}