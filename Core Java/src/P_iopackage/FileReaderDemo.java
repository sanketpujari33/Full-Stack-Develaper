package P_iopackage;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr =new FileReader("D:/Documents/Full-Stack-Develaper/Core Java/src/P_iopackage/FileWriterDemo.java");
        BufferedReader br = new BufferedReader(fr);
        int n;
        while ((n= br.read())!=-1) //-1 indicates EOF
            System.out.print((char)n); //Hibernate is an ORM Framework
        br.close();
        fr.close();
//        char c= 'p';
//        System.out.println((int)c);//112 - UNICODE of char 'p'
    }
}
