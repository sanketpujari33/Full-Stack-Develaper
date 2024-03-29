package N_Sorting;

public class MergeTwoSortedArrays {
    public static int [] mergeTwoSorted(int[] arr1,int n, int[] arr2, int m){
        int size=n+m;

        int []marged = new int[size];

        int i=0, j=0, k=0;

        while(i < n && j < m){
            if(arr1[i]<arr2[j]){
                marged[k]=arr1[i];
                i++;
            }else{
                marged[k]=arr2[j];
                j++;
            }
            k++;
        }

        while (i < n){
            marged[k]=arr1[i];
            i++;
            k++;
        }

        while (j < m){
            marged[k]=arr2[j];
            j++;
            k++;
        }

        return marged;
    }
    public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };
        int n=arr1.length, m=arr2.length;
        int result[]=mergeTwoSorted(arr1,n, arr2, m);
        printArray(result);
    }
}
