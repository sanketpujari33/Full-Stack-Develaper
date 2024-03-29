package NN_SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumSubArrays {
    public static  int maximumSumSubArrays4(int arr[], int k){
        int n = arr.length;
    // k must be smaller than n
        if (n < k) {
        System.out.println("Invalid");
        return -1;
    }

    // Create Queue
    Queue<Integer> q = new LinkedList<Integer>();

    // Initialize maximum and current sum
    int m = Integer.MIN_VALUE;
    int su = 0;

    // Compute sum of first k elements
    // and also store them inside queue
        for (int i = 0; i < k; i++) {
        q.add(arr[i]);
        su += arr[i];
    }

    // Compute sum of remaining elements
        for (int i = k; i < n; i++) {

        // remove first element from the queue
        su -= q.peek();
        q.remove();

        // add current element to the queue
        q.add(arr[i]);
        su += arr[i];

        // update maximum sum
        m = Math.max(m, su);
    }
        return m;
}
    public static  int maximumSumSubArrays3(int arr[], int k){
        int maxSum=0;
        int windowSum=0;
        int start=0;
        for (int end = 0; end < arr.length; end++) {
            windowSum=windowSum+arr[end];
            if(end>=k-1){
                maxSum=Math.max(maxSum,windowSum);
                windowSum=windowSum-arr[start];
                start++;
            }
        }
        return maxSum;
    }
    public static int maximumSumSubArrays2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static  int maximumSumSubArrays1(int arr[], int k) {
        int max_sum = 0;
        for (int i = 0; i + k <= arr.length; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += arr[j];
            }
            if (temp > max_sum)
                max_sum = temp;
        }

        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={2,7,3,5,8,1};
        int k=3;
        System.out.println(maximumSumSubArrays1(arr,k));
        System.out.println(maximumSumSubArrays2(arr,k));
        System.out.println(maximumSumSubArrays3(arr,k));
        System.out.println(maximumSumSubArrays4(arr,k));
    }
}
