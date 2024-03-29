package I_Array;
public class MaxMinFinder {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {5, 2, 9, 1, 7, 3};

        // Find the maximum number
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        // Find the minimum number
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        // Print the maximum and minimum numbers
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}

