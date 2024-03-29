package C_Conditional_Statements;

public class GCDCalculator {
    public static void main(String[] args) {
        // Example values of two numbers
        int num1 = 36;
        int num2 = 48;

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int calculateGCD(int a, int b) {
        // Ensure that an is greater than or equal to b
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
