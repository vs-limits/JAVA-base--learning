package src.Unit6.DealError;
import java.util.Scanner;

public class dealerror {
    /*
    1.异常的产生，2.异常的类型，3.异常的处理
    一旦产生异常，我们发现产生异常的语句以及之后的语句将不再执行
    默认情况下是进行异常信息的输出，而后自动结束程序的执行
    1.Error:错误，一般是指JVM系统级别的错误，程序员无法处理
    2.Exception:异常，程序员可以处理的异常
    异常分为两种类型：
    1.检测性异常：必须要进行处理，否则程序无法通过编译
    2.非检测性异常：程序员可以选择性处理，也可以不处理
    3.自定义异常：程序员根据需要自定义异常类型
    对于非检查异常来说，我们在编程时可以不进行处理，只是如果不处理的话当发生异常时程序会自动停止
    而检查异常则必须要处理，否则编译将不通过
    */
   public static double Division(double x,double y){
        if(y == 0){
            throw new IllegalArgumentException("分母不为0");
        }
        return x/y;
   }

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        str = sc.nextLine().split(" ");
        try{
            double a = Double.parseDouble(str[0]);
            double b = Double.parseDouble(str[1]);//将字符串转换为double类型
            System.out.println(Division(a,b));
        }catch(NumberFormatException e){
            System.out.println("输入的参数格式不正确");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("输入的参数个数不正确");
        }
        catch(IllegalArgumentException e){
            System.out.println("分母不能为0");
        }
        finally{
            System.out.println("程序结束");
        }
   }
}
