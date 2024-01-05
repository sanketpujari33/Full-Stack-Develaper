package Array;

public class ArrayUtil {
    public void printArray(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int []myArray=new int[5];
        myArray[0]=5;
        myArray[1]=1;
        myArray[2]=8;
        myArray[3]=2;
        myArray[4]=10;
        myArray[2]=9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
        int []arr ={5, 6, 8, 1, 5};
        printArray(arr);
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil=new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}
