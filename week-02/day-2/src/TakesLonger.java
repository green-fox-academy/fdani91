public class TakesLonger {
    public static void main(String[] args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String missingQuote = "always takes longer than";
        String firstPart = quote.substring(0,21); //exclusive
        String secondPart = quote.substring(20); //inclusive

        System.out.println(firstPart + missingQuote + secondPart);
    }
}