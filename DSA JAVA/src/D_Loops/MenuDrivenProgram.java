package D_Loops;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display the menu options
            System.out.println("Menu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Take input for student's marks
                    System.out.print("Enter student's marks (out of 100): ");
                    int marks = scanner.nextInt();

                    // Determine and print the message based on the marks
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60 && marks <= 89) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0 && marks <= 59) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid marks entered.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0 or 1.");
                    break;
            }
        } while (choice != 0);

        // Close the Scanner
        scanner.close();
    }
}
