package src.Unit7.ByteCopy;
import java.io.*;
import java.util.Scanner;

public class bytestreamcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String[] str = strs.split("，");
        File file1 = new File(str[0]);
        File file2 = new File(str[1]);
        InputStream fis = new FileInputStream(file1);
        OutputStream fos = new FileOutputStream(file2);
        int n;
        while((n = fis.read()) != -1){
            fos.write(n);
        }
        fos.close();
        fis.close();
    }
}
