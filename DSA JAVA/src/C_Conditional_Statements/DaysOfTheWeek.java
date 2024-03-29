package C_Conditional_Statements;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of the day
        System.out.print("Enter the number of the month: ");
        int dayNumber = scanner.nextInt();

        // Determine the name of the day based on the input number
        String dayName;
        switch (dayNumber) {
            case 1:
               dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid day number";
                break;
        }
        // Print the name of the day to the user
        System.out.println("The name of the day is: " + dayName );

        // Close the Scanner
        scanner.close();
    }
}
