package L_ExceptionHandling;

class Product // extends object
{
    int pid;
    String pname;
    double price;
    Product(int pid, String pname, double price)
    {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    Product(){}
    public String toString(){
        return pid+" "+pname+" "+price;
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        Product product = new Product(11,"Monitar",500.0);
        System.out.println(product); //invokes toString() implicitly
    }
}
