package C_Conditional_Statements;

public class Circle {
    public static void main(String[] args) {
        double radius = 5.0; // Example value of radius
        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);
    }

    public static double calculateCircumference(double radius) {
        // Circumference of a circle formula: 2 * π * radius
        return 2 * Math.PI * radius;
    }
}
