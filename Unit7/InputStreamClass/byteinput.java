package src.Unit7.InputStreamClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class byteinput {
    /*
    IO 流中的 IO 是 Input（输入） 和 Output（输出） 的简写，是用来处理设备与设备之间的数据传输的
    在 Java 中按照数据流向，流分为输入流和输出流
    InputStream 类是字节输入流的抽象基类，这个抽象类定义了如下两个最重要的方法
    read() 方法，这个方法会读取输入流的下一个字节，并返回字节表示的 int 值（0~255）
    如果已读到末尾，返回 -1 表示不能继续读取了
    close() 方法：关闭流，释放资源
    */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*
        更好的写法是利用 Java 7 引入的新的 try(resource) 语法
        只需要编写 try 语句，让编译器自动为我们关闭资源
        */
        try(InputStream fis = new FileInputStream(str)) {
            int n;
            while((n = fis.read()) != -1){
                System.out.print((char)n);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        
   }
}
