package I_Array;

import java.util.Scanner;

public class AscendingOrderChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isAscending = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
                break;
            }
        }

        // Print the result
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        // Close the Scanner
        scanner.close();
    }
}
