package A_DSA_And_Algorithum_with_Visualizations;

public class Main {
    void print(int arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void sort (int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        print(arr);
    }
    void sort2 (int arr[]){
        for(int i=1; i<arr.length; i++) {
            int smallest=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>smallest){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=smallest;
        }
        print(arr);
    }
    void sort3(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            swap(arr, smallest, i);
        }
        print(arr);
    }
    public static void main(String[] args) {
//        System.ou,t.println("Hello World");
        int arr[]={9,5,3,1,2,4,8,6,0,10,7};
        Main s=new Main();
        s.sort(arr);
        s.sort2(arr);
        s.sort3(arr);
    }
}
