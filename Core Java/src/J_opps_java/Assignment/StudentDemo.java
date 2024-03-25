package J_opps_java.Assignment;

class Student {
    // Data members
    private int rollNum;
    private String studName;
    private double mark1;
    private double mark2;
    private double mark3;
    private double totalMarks;

    // Method to set student details
    public void setStudDetails(int rollNum, String studName, double mark1, double mark2, double mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total marks
    public void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }

    // Method to display student details
    public void displayStudDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student();

        // Setting student details
        student1.setStudDetails(101, "John", 85.5, 90.0, 78.5);

        // Calculating total marks
        student1.calculateTotal();

        // Displaying student details
        student1.displayStudDetails();
    }
}
