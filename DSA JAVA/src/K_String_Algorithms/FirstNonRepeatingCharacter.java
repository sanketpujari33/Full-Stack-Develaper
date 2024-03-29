package K_String_Algorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map=new HashMap<>();
        char[] chars=str.toCharArray();
        for (char ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="racecars";
        int result=firstNonRepeatingCharacter(str);
        if(result==-1){
            System.out.println("not found ");
        }else {
            System.out.println(result);
        }
    }
}
