package C_Conditional_Statements;

public class MaxOfThreeNumber {
    public static void maxOfThree(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else if(b>c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a=100, b=150, c=40;
        maxOfThree(a,b,c);
    }
}
