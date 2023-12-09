package P_iopackage;

import java.io.*;

class Book implements Serializable
{
    int bno;
    String bname;
    transient double bprice; //not included during serialization

    public Book(int bno , String bname , double bprice) {
        this.bno = bno;
        this.bname = bname;
        this.bprice = bprice;
    }
    public Book(){}
    public String toString() {
        return bno+" "+bname+" "+bprice;
    }
}
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
            FileOutputStream fos = new FileOutputStream("book.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Book b=new Book(111,"Learn Spring", 500.0);
            oos.writeObject(b);
            oos.close();
            fos.close();
            //DeSerialization
        FileInputStream fis = new FileInputStream("book.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Book b1=(Book) ois.readObject();
        System.out.println(b1); // invokes toString() implicitly
        ois.close();
        fis.close();
    }
}
