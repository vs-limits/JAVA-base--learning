package src.Unit5.Dateclass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateclass {
	public static void main(String[] args) throws ParseException {
		// 键盘录入你的出生年月日 格式为yyyy-MM-dd
		// 把该字符串转换为一个日期
		// 通过该日期得到一个毫秒值
		// 获取2020年10月1日的毫秒值
		// 两者想减得到一个毫秒值
		// 把该毫秒值转换为天 打印输出
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		/********* Begin *********/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 创建日期格式化对象,格式化输入
        Date d1 = sdf.parse(line);
        Date d2 = sdf.parse("2020-10-1");
        long diff = d2.getTime()-d1.getTime(); // 毫秒差
        diff = diff/(60*60*24*1000);
        System.out.println("你的出生日期距离2020年10月1日:" + diff + "天");
		/********* End *********/
	}
}
