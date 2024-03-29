package M_Searching;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int low=0;
        int high=arr.length;
        while (low<=high) {
            int mid=(high+low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found index: " + result);
        }
    }
}
