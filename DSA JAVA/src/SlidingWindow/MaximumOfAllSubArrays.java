package SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumOfAllSubArrays {
    public static void maximumOfAllSubArrays1(int arr[]) {
      int j=1, k=2;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]>arr[j] && arr[i]>arr[k]){
                list.add(arr[i]);
            }else if(arr[j]>arr[i] && arr[j]>arr[k]){
                list.add(arr[j]);
            }else if(arr[k]>arr[i] && arr[k]>arr[j]){
                list.add(arr[k]);
            }
            j++;
            k++;
        }
        System.out.println(list);
    }
    public static List<Integer> maximumOfAllSubArrays2(int arr[], int k) {
        int []ngeArr=nextGreaterElement(arr);
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i <= arr.length-k ; i++) {
            int j=i;
            while (ngeArr[j]<i+k){
                j=ngeArr[j];
            }
            result.add(arr[j]);
        }
       return result;
    }

    private static int[] nextGreaterElement(int[] arr) {
        int [] result=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i=arr.length-1; i >= 0; i--) {
            if(!stack.isEmpty()){
                while (!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]= arr.length;
            }else {
                result[i]=stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={44,77,33,44,88,11};
        int k=3;
        maximumOfAllSubArrays1(arr);
        System.out.println(maximumOfAllSubArrays2(arr, k));


    }
}
