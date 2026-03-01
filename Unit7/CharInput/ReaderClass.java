package src.Unit7.CharInput;
import java.io.*;
import java.util.Scanner;

public class ReaderClass {
    /*
    Reader 类是 Java 的 IO 库提供的另一个输入流接口。
    它和 InputStream 类的区别是，InputStream 类是一个字节流
    即以 byte 为单位读取，而 Reader 是一个字符流，即以 char 为单位读取。
    常用子类：
    FileReader:实现了文件字符流输入，使用时需要指定编码
    CharArrayReader:把一个char[]数组变成一个字符输入流
    StringReader:把字符串变成一个字符输入流
    */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Reader reader = new FileReader(str);
        for(;;){
            int n = reader.read();
            if(n == -1){
                break;
            }
            System.out.print((char)n);
        }
   }
}
