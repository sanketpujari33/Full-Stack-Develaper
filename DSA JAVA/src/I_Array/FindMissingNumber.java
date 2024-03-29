package I_Array;

public class FindMissingNumber {
    public static int missingNumber(int arr[]){
        int size= arr.length+1;
        int sum=size*(size+1)/2;
        for(int num : arr){
            sum=sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
     int arr[]={2,4,1,8,6,3,7};
        System.out.println(missingNumber(arr));
    }
}
