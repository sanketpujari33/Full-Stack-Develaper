package D_Loops;

import java.util.Scanner;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print all even numbers till n
        System.out.println("Even numbers till " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        // Close the Scanner
        scanner.close();
    }
}

