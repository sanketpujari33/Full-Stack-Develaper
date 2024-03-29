package S_ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        System.out.println(numbers.get(3));
        numbers.add(3,5);
        System.out.println(numbers);
        numbers.set(2,7);
        System.out.println(numbers);
        numbers.remove(4);
        System.out.println(numbers);
        System.out.println(numbers.size());
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
