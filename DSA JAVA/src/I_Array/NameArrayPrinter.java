package I_Array;

import java.util.Scanner;

public class NameArrayPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of names
        System.out.print("Enter the number of names: ");
        int count = scanner.nextInt();

        // Create an array to store the names
        String[] names = new String[count];

        // Prompt the user to enter the names
        System.out.println("Enter the names:");
        for (int i = 0; i < count; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Print the names on the screen
        System.out.println("Names entered by the user:");
        for (String name : names) {
            System.out.println(name);
        }

        // Close the Scanner
        scanner.close();
    }
}
