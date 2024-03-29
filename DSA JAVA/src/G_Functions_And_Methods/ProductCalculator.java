package G_Functions_And_Methods;

public class ProductCalculator {
    public static void main(String[] args) {
        // Example usage
        int num1 = 5;
        int num2 = 7;
        int product = calculateProduct(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product); // Output: 35
    }

    // Function to calculate the product of two numbers
    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }
}
