package H_SwitchStatement_Loop;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter your choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();
        int result = 0;
        boolean isValid = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    isValid = false;
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                isValid = false;
                System.out.println("Invalid Choice!");
        }

        if (isValid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
