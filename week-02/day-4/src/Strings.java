//Given a string, compute recursively (no loops) a new string
// where all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {
        System.out.println(xToLowerCase("qwertxqwertxqwertxxxxx"));

    }

    public static String xToLowerCase(String string) {

        if (string.length() == 0) {
            return "";
        } else {
            if (string.subSequence(string.length() - 1, string.length()).equals('x')) {
                return xToLowerCase(string.substring(0, string.length() - 1)) + 'y';
            } else {
                return xToLowerCase(string.substring(0, string.length() - 1)) + string.charAt(string.length() - 1);
            }
        }
    }
}
//not working...............