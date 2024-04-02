package G_ScannerClass_IfElse;

import java.util.Scanner;

// To find area of a rectangle
public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To find area of a rectangle");
        System.out.println("Enter Length Value");
        int length = s.nextInt();
        System.out.println("Enter breadth Value");
        int breadth = s.nextInt();
        int area = length * breadth;

        System.out.println("Area of a rectangleis ="+area);
    }
}
