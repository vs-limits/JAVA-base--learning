package src.Unit5.Stringclass;
import java.util.Scanner;

public class Stringmethod {
    /*
    indexOf :返回str子字符串在该字符串中第一次出现的位置
    lastIndexOf:查找str子字符串中最后一次出现的位置
    trim():返回取出了前后空格的字符串
    split:将字符串按照str来分割，分割之后返回一个字符串数组
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.next();
        String file2 = sc.next();
        String str = ".java";
        if(file1.indexOf(str) > 0){
            String str1 = file1.substring(file1.length()-str.length());//从0开始截取到指定位置，截取文件后缀名
            if(str.equals(str1) && str.length() < file1.length()){
                System.out.println("是java文件");
            }else{
                System.out.println("不是java文件");
            }
        }else{
            System.out.println("不是java文件");
        }

        int a = file2.lastIndexOf(".");
        int b = file2.lastIndexOf("@");
        if(a > 0 && b > 0 && a > b){
            System.out.println("合法的电子邮箱地址");
        }else{
            System.out.println("不合法的电子邮箱地址");
        }
    }
}
