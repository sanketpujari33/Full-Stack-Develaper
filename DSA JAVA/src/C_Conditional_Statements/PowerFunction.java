package C_Conditional_Statements;

public class PowerFunction {
    public static void main(String[] args) {
        // Example values of x and n
        double x = 2.5;
        int n = 3;

        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }

    public static double power(double x, int n) {
        double result = 1.0;

        // If n is negative, calculate the reciprocal of x raised to the positive power of n
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        // Multiply x by itself n times
        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }
}
