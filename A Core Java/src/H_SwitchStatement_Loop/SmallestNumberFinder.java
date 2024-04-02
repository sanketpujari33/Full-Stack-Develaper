package H_SwitchStatement_Loop;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        // Reading 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0]; // Assuming the first number is the smallest initially

        // Finding the smallest number among the 10 given numbers
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number among the given 10 numbers is: " + smallest);

        scanner.close();
    }
}

