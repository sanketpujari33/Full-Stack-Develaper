package O_Recursion.Recursion1;

public class PrintNumber5To1 {
    public static void printNumber(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printNumber(n-1);
    }
    public static void main(String[] args) {
            int n=5;
            printNumber(n);

    }
}
