package O_Recursion.Recursion1;

public class PrintNumber1To5 {
    public static void printNumber(int n){
        if(n==6)
            return;
        System.out.print(n+" ");
        printNumber(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumber(n);

    }
}
