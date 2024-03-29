package I_Array;

public class ReverseArray {
    public static void reverseArray(int number[], int start, int end){
        while (start<end){
            int temp =number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,7,10,6,5};
        reverseArray(arr,0,arr.length-1);
    }
}
