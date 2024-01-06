package Sorting;

public class SquaresOfASortedArray {
    public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] SquaresOfASortedArray(int arr[]){
        int size=arr.length;
        int[] result=new int[size];
        int i=0, j=size-1;
        for (int k = size-1; k >= 0 ; k--) {
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k]=arr[i]*arr[i];
                i++;
            }else{
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int [] result = SquaresOfASortedArray(arr);
        printArray(result);
    }
}
