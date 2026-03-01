package src.Unit5.Stringclass;
import java.util.Scanner;

public class stringbuffer {
    /*
    StringBuffer类和String类一样，也用来代表字符串，只是由于StringBuffer的内部实现方式和String不同
    StringBuffer在进行字符串处理时，不生成新的对象，所以在内存使用上，StringBuffer类要优于String类。
    */
   
   /*
   append()方法的作用是追加内容到当前StringBuffer对象的末尾，类似于字符串的连接
   reverse()方法将把当前字符序列反转后返回
   String string2 = stringBuffer.toString();  //StringBuffer转换为String
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        String[] word = data.split(" ");//已空格分割字符串
        String str1 = "";
        int len = word.length;
        for(int i = 0;i < len;i++){
            StringBuffer sB = new StringBuffer(word[i]);
            word[i] = sB.reverse().toString();//将字符串反转
            if(i == 0){
                str1 = word[0];
            }else{
                str1 = str1 + " " + word[i];
            }
        }
        sb = new StringBuffer(str1);
        System.out.println(sb);
        System.out.println(sb.reverse().toString());
    }
}
