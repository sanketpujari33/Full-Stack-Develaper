package N_Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);// Autoboxing - added in java 5 version
        al.add(20);
        al.add("xxx");
        al.add("yyy");
        System.out.println(al);  //[10, 20, xxx, yyy]
        al.add(2,"ppp");
        System.out.println(al); //[10, 20, ppp, xxx, yyy]
        al.set(2,"qqq");
        System.out.println(al); //[10, 20, qqq, xxx, yyy]
        al.remove("qqq");
        System.out.println(al);  //[10, 20, xxx, yyy]
        al.remove(2);
        System.out.println(al);  //[10, 20, yyy]
        String s=(String) al.get(2);
        System.out.println(s); //xxx
        System.out.println("Size ="+ al.size()); //3
    }
}
/*
    Converting respective primitive type into reference type or vice-versa automatically
    this feature is known as autoboxing

 */