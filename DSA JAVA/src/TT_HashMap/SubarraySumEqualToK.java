package TT_HashMap;

import java.util.HashMap;

public class SubarraySumEqualToK {
    public static int subarraySum(int[] nums, int k) {
        // write your code here
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        map.put(0, 1);
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
            if(map.containsKey(k - nums[i]))
                count += map.get(k - nums[i]);
        }
        return count;
    }
    public static int subarraySumEqualToK(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        map.put(0, 1);
        int ans=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum, 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        System.out.println(subarraySumEqualToK(arr, k));
        System.out.println(subarraySum(arr, k));
    }
}
