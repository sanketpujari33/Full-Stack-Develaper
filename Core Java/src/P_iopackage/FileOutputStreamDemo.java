package P_iopackage;

import  java.io.*;
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos =new FileOutputStream("file1.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos);
        String s="Java is oo Programming Language";
        fos.write(s.getBytes());
        System.out.println("files Created");
        fos.close();
    }
}
