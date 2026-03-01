package src.Unit2;
import java.util.Scanner;

public class Helloarray {
	public static void main(String[] args) {
        //int[] arr = {10,20,30,40,50};

        Scanner input = new Scanner(System.in);
		int[] scores = new int[input.nextInt()];
		
		//循环给数组赋值
		for(int i = 0 ; i< scores.length;i++){
			scores[i] = input.nextInt();
		}
		/********** Begin **********/
		//在这里计算数组scores的平均值和最大值
        int max = scores[0];
        double sum = 0;
        double ava = 0.0;
		for(int i = 0;i < scores.length;i++){
                if(scores[i] > max){
                    max = scores[i];
                }
                sum += scores[i];
        }
        ava = sum / scores.length;
		System.out.println("平均值："  + ava);
		System.out.println("最大值："  + max);
		/********** End **********/
	}
}
