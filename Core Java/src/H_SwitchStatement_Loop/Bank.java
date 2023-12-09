package H_SwitchStatement_Loop;

import java.util.Scanner;

public class Bank {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter current balance:");
            double currentBalance = scanner.nextDouble();

            int choice;

            do {
                System.out.println("Choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Display Balance");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter deposit amount:");
                        double depositAmount = scanner.nextDouble();
                        currentBalance += depositAmount;
                        break;
                    case 2:
                        System.out.println("Enter withdrawal amount:");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= currentBalance) {
                            currentBalance -= withdrawAmount;
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;
                    case 3:
                        System.out.println("Current Balance: " + currentBalance);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                        break;
                }
            } while (choice != 4);

            scanner.close();
        }
    }

