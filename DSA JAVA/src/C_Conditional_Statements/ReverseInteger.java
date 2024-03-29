package C_Conditional_Statements;

public class ReverseInteger {
    public static long reverseInteger(int number){
        boolean isNagative=number<0;
        if (isNagative){
            number=number*-1;
        }
        long reverse=0;
        int lastDigit;
        while (number > 0){
            lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        return isNagative ? reverse * -1 :reverse;
    }
    public static void main(String[] args) {
        int number=-1234;
        System.out.println(reverseInteger(number));
    }
}
