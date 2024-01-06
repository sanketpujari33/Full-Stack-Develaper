package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
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
        selectionSort(arr);
        printArray(arr);
    }
}
