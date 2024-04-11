package TT_HashMap;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            if(map.containsKey(nums[i]))
            map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
            for(int key : map.keySet()){
                if (map.get(key) > size/3)
                    return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {//o(n)
        int[] nums = { 2, 2, 2,2,2,1, 3, 2, 5, 1, 3, 1, 5, 1};
       System.out.print(majorityElement(nums));

    }
}
