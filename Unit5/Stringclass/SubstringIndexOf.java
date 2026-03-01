package src.Unit5.Stringclass;
import java.util.Scanner;

public class SubstringIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int t0,t1;
        for(t0 = 0;t0 < str.length();t0++){
            /*
            indexOf()方法用于在String类的对象中查找子字符串
            方法返回一个整数值，为子字符串的开始位置，若存在多个子字符串，返回数值最小的整数值
            如果没有找到子字符串，返回-1
            */
            t1 = str.indexOf(str1,t0);//从下标t0开始查找子字符串str1
            if(t1 != -1){
                if(t0 != -1){
                    System.out.println(t1);
                }
            }else{
                break;
            }
            t0 = t1 + str1.length();//
        }
    }
}
