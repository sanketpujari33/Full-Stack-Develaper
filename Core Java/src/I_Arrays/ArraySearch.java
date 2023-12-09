package I_Arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter value to search");
        int value=scanner.nextInt();
        boolean isFound=false;
        for (int i = 0; i < array.length; i++){
            if(value==array[i]){
                isFound=true;
                break;
            }
        }
        if(isFound==true)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
