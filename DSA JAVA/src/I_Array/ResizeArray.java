package I_Array;

public class ResizeArray {
    public static int[] resize(int arr[],int capacity){
        int []temp=new int[capacity];
        for (int i=0; i< arr.length; i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int newArr[]=resize(arr,10);
        for (int i = 0; i <newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
