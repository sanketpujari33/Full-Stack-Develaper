package Searching;

public class LinearSearch {
    public static  int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 70;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found index: " + result);
        }
    }
}
