package I_Array;

public class RemoveElement {
    public static int removeElement(int arr[],int val) {
        int newArr[] = new int[arr.length];
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != val) {
                arr[i] = arr[j];
                newArr[i] = arr[j];
                i++;
            }
        }
        for(int k=0; k< newArr.length; k++){
            System.out.print(newArr[k]+" ");
        }
        System.out.println();
        return i;
    }
    public static void main(String[] args) {
     int arr[]={0,1,2,2,3,0,4,2};
     int val=2;
        System.out.println(removeElement(arr, val));
    }

}
