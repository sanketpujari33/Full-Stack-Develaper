package H_SwitchStatement_Loop;



public class FactorialSumTable {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println(" Number     Factorial");
        System.out.println("-----------------------");

        int sum = 0;
        int factorial = 1;

        for (int i = 1; i <= 5; i++) {
            factorial *= i;
            sum += factorial;
            System.out.println("  " + i + "             " + factorial);
        }

        System.out.println("-----------------------");
        System.out.println("        sum = " + sum);
        System.out.println("-----------------------");
    }
}
