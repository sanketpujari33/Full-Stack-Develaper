package N_Collections;

import java.util.LinkedList;

public class GenericsCollection {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]
        for(int i : list){
            System.out.println(i);
                 /*
                 1
                 2
                 3
                  */
        }
    }
}
