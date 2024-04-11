package I_Array;

public class AddingAndUpdatingArray {
    public static void main(String[] args) {
        int [] myArray=new int[5];
        myArray[0]=5;
        myArray[1]=10;
        myArray[2]=15;
        myArray[3]=20;
        myArray[4]=25;
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        myArray[2] = 66;
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        System.out.println(myArray.length);
    }
}
