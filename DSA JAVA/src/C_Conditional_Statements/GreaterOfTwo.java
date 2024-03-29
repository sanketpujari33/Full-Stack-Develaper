package C_Conditional_Statements;

public class GreaterOfTwo {
    public static void main(String[] args) {
        int a = 30; // Example value of a
        int b = 50; // Example value of b

        int greater = findGreater(a, b);
        System.out.println("The greater of " + a + " and " + b + " is: " + greater);
    }

    public static int findGreater(int a, int b) {
        return (a > b) ? a : b;
    }
}
