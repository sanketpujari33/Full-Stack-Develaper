package O_LE_FI_SAPI;
import  java.util.*;
import java.util.stream.*;

class Product
{
    int pid;
    String pname;
    int price;
    Product(int pid, String pname, int price){
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }
    Product(){};
    public  String toString(){
        return pid+" "+pname+" "+price;
    }
}
public class StreamDemo2
{
    public static void main(String[] args)
    {
        List<Product> list1 = new ArrayList<Product>();
        for(Product product : getProducts())
        {
            if(product.price > 1000)
                list1.add(product);
        }
        list1.forEach(System.out::println);
        // using stream API
        List<Product> list2 = getProducts().stream().filter(product -> product.price > 1000).collect(Collectors.toList());
            list2.forEach(System.out::println);
    }
    private  static  List<Product> getProducts()
    {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(111, "monitors", 5000));
        products.add(new Product(222, "keybord", 500));
        products.add(new Product(333, "mouse", 300));
        products.add(new Product(444, "ups", 2000));
        products.add(new Product(555, "speakerd", 1000));
        return products;
    }
}
