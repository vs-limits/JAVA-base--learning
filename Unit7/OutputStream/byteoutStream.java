package src.Unit7.OutputStream;
import java.io.*;
import java.util.Scanner;

public class byteoutStream {
    /*
    OutputStream 类是 Java 标准库提供的最基本的字节输出流。
    OutputStream 类也是抽象类，它是所有输出流的超类。
    1. write(int b)方法:会将一个字节写入输出流
    2.close(int b)方法：用于关闭输出流
    3.flush()方法：刷新输出流，强制将缓冲区中的数据写出,真正输出到目的地
    常用子类：
    FileOutputStream:文件字节输出流
    ByteArrayOutputStream:内存字节输出流
    */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("，");
        try(OutputStream fos = new FileOutputStream(strs[1])){
            fos.write(strs[0].getBytes("UTF-8"));
            fos.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
   }
}
