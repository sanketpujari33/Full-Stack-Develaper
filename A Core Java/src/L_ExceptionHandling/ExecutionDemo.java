package L_ExceptionHandling;

public class ExecutionDemo {
    public static void main(String[] args)  {
        System.out.println("Begin of Program");
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        try {
            int res= n1/n2;
            System.out.println("Result = "+ res);
        } catch (Exception e) {
            System.err.println("divide by zero not allowed");
        }
        System.out.println("End of Program");
    }
}

/*
String [] args is used to store command line arguments
    Run
    ---
        > java ExecutionDemo 10 5
            10 and 5 are command line arguments
*/