package TT_HashMap;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public  static  int unionOfTwoArrays(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(unionOfTwoArrays(arr1, arr2));
    }
}
