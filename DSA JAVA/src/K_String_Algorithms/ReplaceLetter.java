package K_String_Algorithms;

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Replace 'e' with 'i' in the original string
        String result = replaceLetter(original, 'e', 'i');

        // Print the result
        System.out.println("Result: " + result);

        // Close the Scanner
        scanner.close();
    }

    // Function to replace a letter in a string
    public static String replaceLetter(String str, char target, char replacement) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Iterate through the character array and replace the target letter with the replacement letter
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                chars[i] = replacement;
            }
        }

        // Convert the character array back to a string
        return new String(chars);
    }
}
