import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> book = new HashMap<>();

        book.put("William A. Lathan", "405-709-1865");
        book.put("John K. Miller", "402-247-8568");
        book.put("Hortensia E. Foster", "606-481-6467");
        book.put("Amanda D. Newland", "319-243-5613");
        book.put("Brooke P. Askew", "307-687-2982");

        System.out.println(book.get("John K. Miller")); //What is John K. Miller's phone number?

        List<String> allKeys = new ArrayList<>();

        String value = "307-687-2982";
        for (String key : book.keySet())
        {
            if (book.get(key).equals(value))
            {
                allKeys.add(key);
            }
        }
        System.out.println("phone number: 307-687-2982 belongs to: " + allKeys);

        if (book.containsKey("Chris E. Myers"))
        {
            System.out.println("We know Chris E. Myers' phone number");
            System.out.println("We know Chris E. Myers' phone number");
            System.out.println("We know Chris E. Myers' phone number");
        }
        else {
            System.out.println("We don't know Chris E. Myers' phone number");
        }
    }
}
