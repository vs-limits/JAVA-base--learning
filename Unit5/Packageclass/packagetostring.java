package src.Unit5.Packageclass;

public class packagetostring {
    public static void main(String[] args) {
        double a = 78.4;
        String str = Double.toString(a);
        System.out.println(str + 12);//将基本数据类型转换为字符串
        double d = Double.parseDouble(str);//将字符串转换为对应的基本数据类型
        System.out.println(d + 12);

    }
}
