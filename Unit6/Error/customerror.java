package src.Unit6.Error;
import java.util.Scanner;

public class customerror {
    /*
    一般使用继承Exception类的方式来自定义异常
    我们只需要继承Exception，再将信息传递给父类就可以了
    */
   public static void main(String[] args)throws MyException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        if(username.length() < 3){
            throw new MyException("用户名小于三位Exception");
        }else{
            System.out.println("用户名合法");
        }
   }
}

class MyException extends Exception{
    private static final long serialVersionUID = 1L;//序列化ID

    public MyException(){

    }
    public MyException(String message){
        super(message);
    }
}
