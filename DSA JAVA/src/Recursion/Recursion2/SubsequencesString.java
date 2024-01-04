package Recursion.Recursion2;

import java.util.HashSet;

public class SubsequencesString {
    public static  void subSequences1(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        subSequences1(str, idx+1, newString+currChar);
        subSequences1(str, idx+1, newString);
    }
    public static  void subSequences2(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        subSequences2(str, idx+1, newString+currChar, set);
        subSequences2(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        subSequences1(str,0,"");
        HashSet<String> set=new HashSet<>();
//        subSequences2(str,0,"", set);
    }
}
