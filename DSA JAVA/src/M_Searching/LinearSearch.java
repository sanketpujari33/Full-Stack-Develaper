package M_Searching;

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
        int[] arr = {9, 2, 8, 5, 4, 3, 1, 0, 7, 10, 6};
        int target = 7;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found index: " + result);
        }
    }
}
