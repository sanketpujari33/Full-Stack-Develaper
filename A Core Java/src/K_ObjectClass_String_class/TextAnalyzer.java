package K_ObjectClass_String_class;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = scanner.nextLine().toLowerCase(); // Convert text to lowercase for easier comparison

        int vowels = 0;
        int consonants = 0;
        int words = 0;
        boolean isWord = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }

            // Count words based on spaces and non-alphabetic characters
            if (ch != ' ' && (i == 0 || text.charAt(i - 1) == ' ' || !Character.isLetter(text.charAt(i - 1)))) {
                words++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of words: " + words);

        scanner.close();
    }
}

