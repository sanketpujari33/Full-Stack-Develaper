package I_Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int[] array = {5, 8, 6, 4, 7};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        System.out.println("Biggest = " + max);
        System.out.println("Second Biggest = " + secondMax);
        System.out.println("Smallest = " + min);
        System.out.println("Second Smallest = " + secondMin);
    }
}

