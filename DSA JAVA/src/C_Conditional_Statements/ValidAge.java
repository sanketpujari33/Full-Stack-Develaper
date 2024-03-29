package C_Conditional_Statements;

import java.util.Scanner;

public class ValidAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are valid!");
        } else {
            System.out.println("You are not valid!");
        }
    }
}
