package H_SwitchStatement_Loop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int originalNumber = number; // Store the original number

        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get the rightmost digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the rightmost digit
        }

        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}

