package K_String_Algorithms;
import java.util.Scanner;

public class EmailToUsername {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an email
        System.out.print("Enter an email: ");
        String email = scanner.nextLine();

        // Extract the username from the email
        String username = extractUsername(email);

        // Print the username to the user
        System.out.println("Username: " + username);

        // Close the Scanner
        scanner.close();
    }

    // Function to extract the username from an email
    public static String extractUsername(String email) {
        // Find the index of '@' in the email
        int atIndex = email.indexOf('@');

        // Extract the substring before '@' to get the username
        String username = email.substring(0, atIndex);

        return username;
    }
}
