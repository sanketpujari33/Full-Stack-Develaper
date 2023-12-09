package L_ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try
        {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int result= n1/n2;
            System.out.println("result: " + result);

        }
        catch (ArithmeticException e)
        {
            System.err.println("Divide by zero not allowed");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Required two numbers");
        }
        catch (NumberFormatException e)
        {
            System.err.println("Enter only numbers");
        }
        catch (RuntimeException e)
        {
            System.err.println("Runtime Exception occurred");
        }
        catch (Exception e)
        {
            System.err.println("Exception occurred");
        }
    }
}
