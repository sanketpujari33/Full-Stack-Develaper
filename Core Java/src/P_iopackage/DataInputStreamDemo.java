package P_iopackage;

import java.io.*;
public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file2.txt");
        DataInputStream dis = new DataInputStream(fis);
        int n= dis.readInt();
        System.out.println(n);//10
        String str= dis.readUTF();
        System.out.println(str);//Hello
        double d= dis.readDouble();
        System.out.println(d); //3.14
        dis.close();
        fis.close();
    }
}
