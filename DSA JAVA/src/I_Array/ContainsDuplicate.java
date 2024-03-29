package I_Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate1 (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicate2 (int arr[]){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
    return false;
    }
    public static void main(String[] args) {
        int arr[]={7, 3, 1, 4, 1};
        System.out.println(containsDuplicate1(arr));
        System.out.println(containsDuplicate2(arr));
    }
}
