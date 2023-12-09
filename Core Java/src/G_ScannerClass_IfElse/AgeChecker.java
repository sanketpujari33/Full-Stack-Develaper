package G_ScannerClass_IfElse;

public class AgeChecker {
    public static void main(String[] args) {
        int age = 18; // Replace this with the age you want to check

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("The person is major.");
        } else {
            System.out.println("The person is minor.");
        }
    }
}
