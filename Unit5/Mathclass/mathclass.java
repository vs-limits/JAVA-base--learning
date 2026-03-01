package src.Unit5.Mathclass;
import java.util.Scanner;
import java.lang.Math;

public class mathclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		double a5 = sc.nextDouble();
		double a6 = sc.nextDouble();
		double a7 = sc.nextDouble();
		double a8 = sc.nextDouble();
		double a9 = sc.nextDouble();
		double a10 = sc.nextDouble();
		double a11 = sc.nextDouble();
		/********* Begin *********/
        System.out.println(Math.sqrt(a1));//开平方
        System.out.println(Math.cbrt(a2));//立方根
        System.out.println(Math.pow(a3,a4));//幂运算
        System.out.println(Math.max(a5,a6));//最大值
        System.out.println(Math.min(a5,a6));//最小值
        System.out.println(Math.abs(a7));//绝对值
        System.out.println(Math.ceil(a8));//向上取整
        System.out.println(Math.floor(a9));//向下取整
        System.out.println(Math.rint(a10));//四舍五入
        System.out.println(Math.round(a11));//四舍五入取整
		/********* End *********/
	}
}
