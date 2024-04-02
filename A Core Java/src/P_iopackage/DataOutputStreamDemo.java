package P_iopackage;

import java.io.*;
public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos= new FileOutputStream("D:/Documents/Full-Stack-Develaper/Core Java/src/P_iopackage/file2.txt");
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeInt(10);
        dos.writeUTF("Hello Sanket"); //Unified Text Format
        dos.writeDouble(3.14);
        System.out.println("File Created");
        dos.close();
        fos.close();
    }
}
