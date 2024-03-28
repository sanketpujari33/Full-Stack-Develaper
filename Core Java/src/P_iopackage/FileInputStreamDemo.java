package P_iopackage;

import  java.io.*;
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream fis= new FileInputStream("D:/Documents/Full-Stack-Develaper/Core Java/src/P_iopackage/file1.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        int size= bis.available(); //return the size of the file
        byte[] buffer= new byte[size];
        bis.read(buffer);
        String s= new String(buffer); //converts byte[] into string
        System.out.println(s);
        bis.close();
        fis.close();
    }
}
