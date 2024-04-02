package P_iopackage;

import  java.io.*;
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos =new FileOutputStream("D:/Documents/Full-Stack-Develaper/Core Java/src/P_iopackage/file1.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos);
        String s="Java is oo Programming Language";
        bos.write(s.getBytes());
        System.out.println("files Created");
        bos.close();
        fos.close();
    }
}
