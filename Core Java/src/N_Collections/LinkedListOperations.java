package N_Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 10) {
            System.out.println("\n1. Add element at last");
            System.out.println("2. Add element at first");
            System.out.println("3. Add element at the given index");
            System.out.println("4. Update element at the given index");
            System.out.println("5. Delete the first element");
            System.out.println("6. Delete the last element");
            System.out.println("7. Delete the given element");
            System.out.println("8. Delete the element at given index");
            System.out.println("9. Display the elements");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add at last: ");
                    int lastElement = scanner.nextInt();
                    linkedList.addLast(lastElement);
                    break;

                case 2:
                    System.out.print("Enter element to add at first: ");
                    int firstElement = scanner.nextInt();
                    linkedList.addFirst(firstElement);
                    break;

                case 3:
                    System.out.print("Enter element to add: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter index to add at: ");
                    int index = scanner.nextInt();
                    linkedList.add(index, element);
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = scanner.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = scanner.nextInt();
                    linkedList.set(updateIndex, newValue);
                    break;

                case 5:
                    linkedList.removeFirst();
                    break;

                case 6:
                    linkedList.removeLast();
                    break;

                case 7:
                    System.out.print("Enter element to delete: ");
                    int deleteElement = scanner.nextInt();
                    linkedList.remove(Integer.valueOf(deleteElement));
                    break;

                case 8:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    linkedList.remove(deleteIndex);
                    break;

                case 9:
                    System.out.println("Elements in the LinkedList: " + linkedList);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
    }
}
