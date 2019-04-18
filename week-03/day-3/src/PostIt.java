import java.awt.*;

public class PostIt {

    Color backGroundColor;
    String text;
    Color textColor;


    public static void main(String[] args) {

        PostIt orange = new PostIt();
        orange.backGroundColor = Color.orange;
        orange.text = "Idea 1";
        orange.textColor = Color.blue;

        PostIt pink = new PostIt();
        pink.backGroundColor = Color.pink;
        pink.text = "Awesome";
        pink.textColor = Color.black;

        PostIt yellow = new PostIt();
        yellow.backGroundColor = Color.yellow;
        yellow.text = "Superb";
        yellow.textColor = Color.green;
    }
}
