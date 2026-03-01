package src.Unit7.FileClass;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;

public class createfile {
    /*
    如何创建文件
    如何判断文件是否存在
    */
   public static void main(String[] args) {
        File file1 = null;
        File file2 = null;
        try {
            file1 = new File("text.txt");
            file2 = new File("hello.txt");
            file1.createNewFile();
            file2.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        boolean Exists1 = file1.exists();
        boolean Exists2 = file2.exists();
        if(Exists2){
            System.out.println("文件hello.txt存在");
        }
        if(Exists1){
            System.out.println("文件text.txt存在");
        }
   }
}
