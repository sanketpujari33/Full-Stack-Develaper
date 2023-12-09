package G_ScannerClass_IfElse;

public class BiggestNumberFinder {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int biggest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The biggest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + biggest);
    }
}

