package B_Variables_Input_Output;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = calculateAverage(num1, num2, num3);

        // Print the average
        System.out.println("Average: " + average);

        // Close the Scanner
        scanner.close();
    }

    // Function to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
