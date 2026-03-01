package src.Unit7.CharOutput;
import java.io.*;
import java.util.Scanner;

public class WritedClass {
    /*
    Writer 就是带编码转换器的 OutputStream，它把 char 转换为 byte 并输出。
    常用方法
    write():写入一个字符到输出流
    close():用于关闭输出流
    flush():将缓冲区的内容真正输出到目的地
    */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.next();
        String[] str = strs.split("，");
        File file1 = new File(str[0]);
        FileWriter fos = new FileWriter(file1);
        fos.write(str[1]);
        fos.flush();
        fos.close();
   }
}
