package G_ScannerClass_IfElse;

import java.util.Scanner;

public class ItemPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item number:");
        int itemNumber = scanner.nextInt();

        System.out.println("Enter item name:");
        String itemName = scanner.next();

        System.out.println("Enter rate:");
        double rate = scanner.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        double price = rate * quantity;
        double discount = 0.0;

        if (price >= 1000 && price < 2000) {
            discount = 0.1 * price;
        } else if (price >= 2000 && price < 3000) {
            discount = 0.15 * price;
        } else if (price >= 3000 && price < 5000) {
            discount = 0.2 * price;
        } else if (price >= 5000) {
            discount = 0.25 * price;
        }

        double netPrice = price - discount;

        System.out.println("Item Number: " + itemNumber);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Net Price: " + netPrice);

        scanner.close();
    }
}

