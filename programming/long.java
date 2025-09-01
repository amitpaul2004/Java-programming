//fing longest word on a string 
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Split string into words by spaces
        String[] words = input.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        // Find the longest word
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}
