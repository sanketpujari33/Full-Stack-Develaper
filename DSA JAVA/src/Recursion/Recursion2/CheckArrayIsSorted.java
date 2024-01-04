package Recursion.Recursion2;

public class CheckArrayIsSorted {

    public static boolean isSorted1(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
            if(arr[idx]<arr[idx+1]){
                return isSorted1(arr,idx+1);
            }else {
                return false;
            }
        }
    public static boolean isSorted2(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }

            return isSorted2(arr,idx+1);

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,10,4,5,6,7};
        System.out.println(isSorted1(arr,0));
        System.out.println(isSorted2(arr,0));
    }
}
