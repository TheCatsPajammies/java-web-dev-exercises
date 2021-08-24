package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term:");
        String searchTerm = input.nextLine();
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank,\n and" +
                " of having nothing to do: once or twice she had peeped into the book her\n sister was reading, " +
                "but, but it had no pictures or conversations in it, 'and what is the\n use of a book,' thought Alice" +
                "'without pictures or conversation?'";
        Integer index = alice.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.\n");
        String modifiedSentence = alice.replace(searchTerm, "(Your search term)");
        System.out.println(modifiedSentence);

    }
}
