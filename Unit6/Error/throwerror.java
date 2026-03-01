package src.Unit6.Error;

public class throwerror {
    /*
    如何使用throw和throws关键字
    throws关键字的作用是：抛出异常
    我们可以将自己不想处理的异常交给别人来处理
    我们只需要用throws关键字抛出该异常即可。
    如果在方法的括号后面抛出一个异常，那么该方法的调用者是必须要捕获这个异常或者将这个异常继续抛出的
    解决方法:
    1.使用try-catch捕获该异常
    2.继续使用throws将该异常抛出给上一级调用者处理//把“锅”甩给Java虚拟机

    throw关键字的作用是：主动抛出异常
    throw是语句抛出一个异常，一般是在代码块的内部，当程序出现某种逻辑错误时由程序员主动抛出某种特定类型的异常
    使用throw关键字主动抛出检测性异常的时候，在方法名上必须使用throws表明调用这个方法可能存在要抛出的异常

    */
   public static void main(String[] args) throws Exception {
    try{ 
        test();
    }catch(Exception e){
        System.out.println("main方法捕获到异常了");
    }
    try{ 
        Test(100,0);
    }catch(Exception e){
        System.out.println("除数不能为0");
    }
   }
   public static void test() throws Exception {
        System.out.println("test方法执行了");
        throw new Exception("我抛出一个异常");//主动抛出异常
   }
   public static void Test(int n1,int n2)throws Exception {
        System.out.println("Test方法执行了"); 
        System.out.println((double)n1/n2);
   }
}
