package I_Array;

public class ProductOfAnArray {
    public static int[] productOfAnArray(int arr[], int size){
        int product=1;
        int result[]=new int[size];
        for (int i = 0; i < size; i++) {
                    result[i]=product;
                    product=product*arr[i];
            }
           product=1;
        for (int i = arr.length-1; i >=0 ; i--) {
            result[i]=result[i]*product;
            product=product*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={ 1, 2, 3, 4};
        int size= arr.length;
       int result[]= productOfAnArray(arr, size);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
