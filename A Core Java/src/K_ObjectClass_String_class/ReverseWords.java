package K_ObjectClass_String_class;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+"); // Split the input line into words

        StringBuilder reversedText = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse(); // Reverse each word
            reversedText.append(reversedWord).append(" ");
        }

        System.out.println("Reversed text: " + reversedText.toString().trim());

        scanner.close();
    }
}

