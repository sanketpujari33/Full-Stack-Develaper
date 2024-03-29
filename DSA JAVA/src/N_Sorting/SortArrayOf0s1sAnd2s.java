package N_Sorting;

public class SortArrayOf0s1sAnd2s {


    public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int []arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void dutchNationalFlagAlgo1(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr,low,mid);
//                    int temp = arr[low];
//                    arr[low] = arr[mid];
//                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
//                    int temp1 = arr[mid];
//                    arr[mid] = arr[high];
//                    arr[high] = temp1;
                    high--;
            }
        }
    }
    public static void dutchNationalFlagAlgo2(int[] arr) {
        int i=0;
        int j=0;
        int k=arr.length-1;
        while (i<=k) {
            if(arr[i]==0){
                    swap(arr,i,j);
                    i++;
                    j++;
            }else if(arr[i]==1){
                i++;
            }else if(arr[i]==2){
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[]={ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        dutchNationalFlagAlgo1(arr1);
        printArray(arr1);

        int arr2[]={ 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        dutchNationalFlagAlgo2(arr2);
        printArray(arr2);
    }
}
