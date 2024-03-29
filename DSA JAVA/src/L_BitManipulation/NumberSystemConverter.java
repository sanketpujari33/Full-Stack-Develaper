package L_BitManipulation;

import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();

        // Convert binary to decimal
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal representation: " + decimalResult);

        // Close the Scanner
        scanner.close();
    }

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
}
