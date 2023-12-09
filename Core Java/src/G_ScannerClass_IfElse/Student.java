package G_ScannerClass_IfElse;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        int rollNumber = s.nextInt();
        System.out.println("Enter Name: ");
        String name = s.next();
        System.out.println("Enter Marks is Three subject: ");
        double marks1 = s.nextDouble();
        double marks2 = s.nextDouble();
        double marks3 = s.nextDouble();
        double total = marks1 + marks2 + marks3;
        double avg = total / 3;
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+ total);
        System.out.println("Average: "+ avg);
    }
}
