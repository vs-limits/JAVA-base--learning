package src.Unit2;
import java.util.Scanner;;

public class sreaching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] name = {"11","22","33","44","55"};
        for(int i = 0;i < name.length;i++){
            if(name[i].equals(str)){
                System.out.println("找到了，位置在：" + (i+1));
                break;
            }
        }

    }
}
