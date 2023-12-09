package J_opps_java;

class Employee {
    //Data members
    int empNum;
    String empName;
    double empSalary;
    //Method
    void setEmpDetails(int empNum, String empName, double empSalary) {
            this.empNum = empNum;
            this.empName = empName;
            this.empSalary= empSalary;
    }
    void dispEmpDetails() {
        System.out.println("Emp Num = " + empNum);
        System.out.println("Emp Name = " + empName);
        System.out.println("EmpSalary = " + empSalary);
    }

}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpDetails(111,"Sanket", 80000.0);
        e1.dispEmpDetails();

        Employee e2 = new Employee();
        e2.setEmpDetails(222, "Ram",15000.0);
        e2.dispEmpDetails();

    }
}
