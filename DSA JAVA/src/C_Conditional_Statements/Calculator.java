package C_Conditional_Statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers and an operation
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        // Calculate the result based on the selected operation
        double result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case 5:
                result = a % b;
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return;
        }

        // Display the result to the user
        System.out.println("Result: " + result);

        // Close the Scanner
        scanner.close();
    }
}
