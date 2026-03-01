package src.Unit5.Stringclass;
import java.util.Scanner;

public class lengthmethod {
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
        System.out.println("Length of first roster: "+roster1.length());//包括空格长度
        System.out.println("Length of second roster: "+roster2.length());
    }
}
