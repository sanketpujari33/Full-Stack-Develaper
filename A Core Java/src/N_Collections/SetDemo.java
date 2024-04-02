package N_Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet -unordered
        HashSet hs= new HashSet();
        hs.add("monitor");
        hs.add("mouse");
        hs.add("ups");
        hs.add("speaker");
        System.out.println(hs.add("monitor"));// false
        System.out.println(hs); //[mouse, speaker, ups, monitor]

        //LinkedHashSet - ordered
        LinkedHashSet lhs= new LinkedHashSet();
        lhs.add("monitor");
        lhs.add("mouse");
        lhs.add("ups");
        lhs.add("speaker");
        System.out.println(lhs.add("monitor"));// false
        System.out.println(lhs); //[monitor, mouse, ups, speaker]

        //TreeSet - sorted
        TreeSet ts= new TreeSet();
        ts.add("monitor");
        ts.add("mouse");
        ts.add("ups");
        ts.add("speaker");
        System.out.println(ts.add("monitor"));// false
        System.out.println(ts); //[monitor, mouse, speaker, ups]
    }
}
