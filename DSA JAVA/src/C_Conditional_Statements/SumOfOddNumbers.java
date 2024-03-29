package C_Conditional_Statements;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 10; // Example value of n
        int sum = sumOfOddNumbers(n);
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }

    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
