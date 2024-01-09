package BasicPrograming;

public class NumberIsPrime {
    public  static boolean isPrime(int n){
        int div=2;
        while (div<n){
            if(n%div==0){
                return true;
            }
            div=div+1;
        }
        return false;
    }
    public static void main(String[] args) {
        if(isPrime(6)) {
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
