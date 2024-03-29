package L_BitManipulation;

import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Count the number of 1's in the binary representation of the number
        int count = countOnes(num);

        // Print the result
        System.out.println("Number of 1's in the binary representation: " + count);

        // Close the Scanner
        scanner.close();
    }

    // Function to count the number of 1's in the binary representation of a number
    public static int countOnes(int num) {
        int count = 0;

        // Iterate through each bit of the number
        while (num != 0) {
            // Increment count if the least significant bit (rightmost bit) is 1
            count += num & 1;
            // Right shift the number to check the next bit
            num >>= 1;
        }

        return count;
    }
}
