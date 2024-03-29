package L_BitManipulation;

import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number and the position of the bit to toggle
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the position of the bit to toggle (0-based index): ");
        int pos = scanner.nextInt();

        // Toggle the bit at the specified position
        int result = toggleBit(num, pos);

        // Print the result
        System.out.println("Number after toggling bit at position " + pos + ": " + result);

        // Close the Scanner
        scanner.close();
    }

    // Function to toggle a bit at a given position in a number
    public static int toggleBit(int num, int pos) {
        // To toggle a bit at a specific position, we can use bitwise XOR (^) operator
        // We can create a mask with a single bit set at the specified position and then use XOR with the number
        // For example, to toggle the 3rd bit (0-based index), we create a mask with 1 at position 3: 1 << 3 = 0b1000
        // Then, we use XOR with the number: num ^ (1 << pos)

        // Create a mask with a single bit set at the specified position
        int mask = 1 << pos;

        // Use bitwise XOR to toggle the bit
        return num ^ mask;
    }
}
