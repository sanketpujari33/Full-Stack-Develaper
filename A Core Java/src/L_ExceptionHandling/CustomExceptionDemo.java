package L_ExceptionHandling;

class AgeException extends Exception
{
    AgeException(String msg)
    {
        super(msg);
    }
    AgeException(){};
}
class Customer
{
    void setAge(int age) throws AgeException
    {
        if(age < 18 || age > 60)
            throw new AgeException("Age must be between 18 and 60");
        else
            System.out.println("Your age is " + age);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        try
        {
            customer.setAge(4);
        }
        catch (AgeException e)
        {
//            System.err.println(e); // invokes toString() implicitly
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
