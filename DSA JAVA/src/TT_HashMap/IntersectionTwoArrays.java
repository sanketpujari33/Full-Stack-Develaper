package TT_HashMap;

import java.util.HashSet;

public class IntersectionTwoArrays {
    public int intersect(int[] nums1, int[] nums2) {
        // write your code here
        HashSet<Integer> set=new HashSet<Integer>();
        int count=0;
        for (int i=0; i<nums1.length; i++)
            set.add(nums1[i]);
        for (int i=0; i<nums2.length; i++) {
            if(set.contains(nums2[i])) {
                count++;
                set.remove(nums2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums1[]={7,3,9};
        int nums2[]={6,3,9,2,9,4};
        System.out.println(new IntersectionTwoArrays().intersect(nums1, nums2));
    }
}
