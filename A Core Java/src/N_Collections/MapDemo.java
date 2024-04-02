package N_Collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // HashMap
        HashMap map = new HashMap();
        map.put("monitors",5000);
        map.put("keyboard",500);
        map.put("mouse",300);
        map.put("ups", 2000);
        map.put("sppeekers",1000);
        System.out.println(map);// {keyboard=500, mouse=300, speekers=1000, ups=2000, monitors=5000}

        // LinkedHashMap
        LinkedHashMap lmap = new LinkedHashMap();
        lmap.put("monitors",5000);
        lmap.put("keyboard",500);
        lmap.put("mouse",300);
        lmap.put("ups", 2000);
        lmap.put("speekers",1000);
        System.out.println(lmap);// {monitors=5000, keyboard=500, mouse=300, ups=2000, speekers=1000}

        // TreeMap
        TreeMap tmap = new TreeMap();
        tmap.put("monitors",5000);
        tmap.put("keyboard",500);
        tmap.put("mouse",300);
        tmap.put("ups", 2000);
        tmap.put("speekers",1000);
        System.out.println(tmap);// {keyboard=500, monitors=5000, mouse=300, speekers=1000, ups=2000}
        System.out.println(tmap.descendingMap());//{ups=2000, speekers=1000, mouse=300, monitors=5000, keyboard=500}


    }
}
