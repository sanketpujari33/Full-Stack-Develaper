package K_String_Algorithms;

import java.util.Scanner;

public class CumulativeStringLength {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings
        System.out.print("Enter the number of strings: ");
        int count = scanner.nextInt();

        // Create an array to store the strings
        String[] strings = new String[count];

        // Prompt the user to enter the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < count; i++) {
            strings[i] = scanner.next();
        }

        // Find the cumulative length of all the strings
        int cumulativeLength = findCumulativeLength(strings);

        // Print the cumulative length
        System.out.println("Cumulative length of all strings: " + cumulativeLength);

        // Close the Scanner
        scanner.close();
    }

    // Function to find the cumulative length of all strings in an array
    public static int findCumulativeLength(String[] strings) {
        int cumulativeLength = 0;
        for (String str : strings) {
            cumulativeLength += str.length();
        }
        return cumulativeLength;
    }
}
