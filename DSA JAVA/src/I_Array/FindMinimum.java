package I_Array;

public class  FindMinimum {
    public static int findMinimum(int arr[]){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,7,10,6,5};
        System.out.println(findMinimum(arr));
    }
}
