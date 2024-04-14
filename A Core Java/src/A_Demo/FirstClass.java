package A_Demo;

public class FirstClass {
    public static int removedupli(int arr[]){
        int count=1;
        for(int i=1;i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println(removedupli(arr));
    }
}
