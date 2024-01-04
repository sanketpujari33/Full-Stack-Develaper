package Recursion;

public class FibonacciSequence {
    public static void fibSeqTillnth(int a, int b, int n){
        if(n ==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibSeqTillnth(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibSeqTillnth(a,b,n-2);
    }
}
