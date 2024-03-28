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
        LinkedList <String> list1 = new LinkedList<String>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        System.out.println(list1);
        for(String i : list1){
            System.out.println(i);
                 /*
                 aaa
                 bbb
                 ccc
                  */
        }
    }
}
