package KadanesAlgorithm;

public class MaximumSumSubarray {

    public static int maxSumSubarray(int arr[]){
        int maxSoFar=arr[0];
        int currentMax=arr[0];
        for(int i=0; i<arr.length; i++){
            currentMax=currentMax+arr[i];
            if(currentMax < arr[i]){
                currentMax=arr[i];
            }
            if(maxSoFar < currentMax){
                maxSoFar=currentMax;
            }
        }
        return maxSoFar;
    }
    public static void main(String[] args) {

    }
}
