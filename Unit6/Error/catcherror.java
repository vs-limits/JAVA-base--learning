package src.Unit6.Error;
import java.util.Scanner;

public class catcherror {
    /*
    有一部分异常是需要程序员提前处理的，这种异常统一称为检测性异常，如果我们不处理
    程序是不能编译通过的，在IDE中也会出现一条红线
    Java中提供了一个捕获异常的机制：try-catch
    我们在捕获异常的时候最好要先明确异常的种类是什么。
    */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
            System.out.println((double)num1/num2);
        }catch(Exception e){//Exception是所有异常的父类，可以捕获所有异常
            System.out.println("出现异常了，除数不能为0");
        }
   }
}
