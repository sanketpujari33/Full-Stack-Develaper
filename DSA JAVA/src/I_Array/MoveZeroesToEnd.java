package I_Array;

public class MoveZeroesToEnd {
    public static void moveZeroesToEnd(int arr[]){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,3,0,5,0,4,0,8,0,4,6,0,1,0,1};
        moveZeroesToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
