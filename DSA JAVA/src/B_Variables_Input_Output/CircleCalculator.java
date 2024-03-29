package B_Variables_Input_Output;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        // Close the Scanner
        scanner.close();
    }
}

