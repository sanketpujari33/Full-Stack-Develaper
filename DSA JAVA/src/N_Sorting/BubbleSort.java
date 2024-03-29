package N_Sorting;

public class BubbleSort {
    public static void sinkingSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length-1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped = true;
                }
            }
            if(isSwapped==false) {
                break;
            }
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5, 6, 8, 4, 1, 2, 7, 3, 9, 10};
        sinkingSort(arr);
        printArray(arr);
    }
}