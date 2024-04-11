package TT_HashMap.HashMap;

import java.util.*;
public class HashMapCode {

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        // search
        if(map.containsKey("China")){
            System.out.println(map.get("key is present in the map"));
        }else{
            System.out.println(map.get("key is not present in the map"));
        };
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));
        int arr[]={12,15,16,17,18,19,20,21,22,23};
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}