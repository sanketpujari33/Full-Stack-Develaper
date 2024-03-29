package L_BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a power of 2
        boolean isPowerOfTwo = checkPowerOfTwo(num);

        // Print the result
        if (isPowerOfTwo) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a number is a power of 2 using bit manipulation
    public static boolean checkPowerOfTwo(int num) {
        // A number is a power of 2 if it has only one bit set in its binary representation.
        // For example, 2^3 = 8. In binary, 8 is represented as 1000, so it has only one bit set.

        // If the number is less than or equal to 0, it cannot be a power of 2
        if (num <= 0) {
            return false;
        }

        // Use bitwise AND operation to check if there is only one bit set in the binary representation of the number
        // If num & (num - 1) is 0, then num has only one bit set and it is a power of 2
        return (num & (num - 1)) == 0;
    }
}
