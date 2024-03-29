package I_Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void twoSum1(int arr[], int target){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
               if(arr[i]+arr[j]==target){
                   System.out.println("The two 1 indices are - "+i+" and "+j);
               }
            }
        }
    }
    public static int[] twoSum2(int arr[], int target){
        int []result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i], i);
            }else{
                result[1]=i;
                result[0]= map.get(target-arr[i]);
                return result;
            }
        }
//        return result;
        throw  new IllegalArgumentException("Two numbers not found");
    }
    public static int[] twoSum3(int arr[], int target){
//        Arrays.sort(arr);
        int left=0;
        int right= arr.length-1;
        int []result=new int[2];
        while (left < right){
            int sum=arr[left]+arr[right];
            if(sum==target){
//                result[0]=arr[left];
//                result[1]=arr[right];
                result[0]=left;
                result[1]=right;
                return result;
            }else if(sum <target){
                left++;
            }else {
                right--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int arr[]=new int[]{ 2, 11, 5, 10, 7, 8};
        int target=9;
        twoSum1(arr,target);
       int ans2[]= twoSum2(arr,target);
            System.out.println("The two 2 indices are - "+ans2[0]+" and "+ans2[1]);
        int ans3[]= twoSum3(arr,target);
        System.out.println("The two 3 indices are - "+ans3[0]+" and "+ans3[1]);

    }
}
