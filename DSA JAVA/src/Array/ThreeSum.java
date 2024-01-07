package Array;

import java.util.Arrays;

public class ThreeSum {
    public static void threeSum1(int arr[], int target){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void threeSum2(int arr[], int target){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            int j=i+1;
            int k= arr.length-1;
            while (j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k++;
                }else if(sum<target){
                    j++;
                }else {
                    k--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,7,1,0};
        int target=6;
        threeSum1(arr, target);
        threeSum2(arr,target);
    }
}
