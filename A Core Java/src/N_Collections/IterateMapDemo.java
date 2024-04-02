package N_Collections;

import java.util.*;

public class IterateMapDemo {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("monitors",5000);
        map.put("keyboard",500);
        map.put("mouse",300);
        map.put("ups", 2000);
        map.put("speekers",1000);

        System.out.println(map);// {keyboard=500, mouse=300, speekers=1000, ups=2000, monitors=5000}
        Set<String> keys =map.keySet();
        for (String key : keys) {
            System.out.println(key+ ":"+map.get(key));
        }

    }
}
