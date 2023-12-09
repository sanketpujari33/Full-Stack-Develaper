package O_LE_FI_SAPI;

import java.util.*;
import java.util.stream.*;
public class StreamapiDemo {
    public static void main(String[] args) {
        List<String> list1=  List.of("apple", "mango", "orange");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        //Enhanced for loop - added in java 5 version
        for (String s: list1){
            System.out.println(s);
        }
//        forEach() -add in java 8 version
        list1.forEach(s -> System.out.println(s));
        list1.forEach(System.out::println);

        // Creating stream using List
        Stream<String> stream1=list1.stream();
        stream1.forEach(System.out::println);

        // Creating stream using Set
        Set<String> set1= new HashSet<String>(list1);
        Stream<String> stream2=set1.stream();
        stream2.forEach(System.out::println);

        // creating stream using Arrays
        String [] strArray= {"xxx", "yyy", "zzz"};
        Stream<String> stream3 = Arrays.stream(strArray);
        stream3.forEach(System.out::println);
    }
}
