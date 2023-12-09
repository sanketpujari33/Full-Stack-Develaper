package N_Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        List<Integer> mobileNos = new ArrayList<>();
        mobileNos.add(1111);
        mobileNos.add(2222);
        mobileNos.add(3333);
        mobileNos.add(4444);
        mobileNos.add(5555);
        mobileNos.add(6666);
        mobileNos.add(2222);
        mobileNos.add(7777);
        mobileNos.add(1111);
        mobileNos.add(5555);
        */
        //Collection Factory Methods - of() - added in java 9 version
        List<Integer> mobileNos= List.of(1111, 2222, 3333, 4444, 5555, 6666, 2222, 7777, 1111, 5555);
        System.out.println(mobileNos); //[1111, 2222, 3333, 4444, 5555, 6666, 2222, 7777, 1111, 5555]
        Set<Integer> uniqueMobleNos =new LinkedHashSet<Integer>();
        uniqueMobleNos.addAll(mobileNos);
        System.out.println(uniqueMobleNos);//[1111, 2222, 3333, 4444, 5555, 6666, 7777]

    }
}
