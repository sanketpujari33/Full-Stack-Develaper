package Array;

public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]){
        int i=1;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j-1]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]={ 0, 0, 1, 2, 2, 2, 4, 4};
        System.out.println(removeDuplicates(arr));
    }
}
