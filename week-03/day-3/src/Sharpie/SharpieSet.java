package Sharpie;

import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> mysharpies;
    int usableSharpies;

    public SharpieSet() {

        mysharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {

        mysharpies.add(sharpie);
    }

    public void removeTrash() {

        for (Sharpie sharpie : mysharpies) {
            if (sharpie.inkAmount <= 0) {
                mysharpies.remove(sharpie);
            }
        }
    }

    public int countUsable() {

        for (Sharpie sharpie : mysharpies) {
            if (sharpie.inkAmount > 0) {
                usableSharpies++;
            }
        }
        return usableSharpies;
    }
}
