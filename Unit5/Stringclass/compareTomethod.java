package src.Unit5.Stringclass;

import java.util.Scanner;

public class compareTomethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		String str4 = scanner.next();
        
		String str5 = scanner.next();
		String str6 = scanner.next();
		String str7 = scanner.next();
		String str8 = scanner.next();
        String roster1 = str1+" "+str2+" "+str3+" "+str4;
		String roster2 = str5+" "+str6+" "+str7+" "+str8;
        /*
        String类中的compareTo()方法将返回两个字符串对象的比较结果，若相等，返回0
        不相等时，从两个字符串第1个字符开始比较，返回第一个不相等的字符差
        另一种情况，较长字符串的前面部分恰巧是较短的字符串，返回它们的长度差。
        */
        if(roster1.compareTo(roster2) != 0){//比较两个字符串的内容是否相同
            System.out.println("不相同");
        }else{
            System.out.println("相同");
        }
    }
}
