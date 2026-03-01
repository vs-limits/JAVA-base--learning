package src.Unit5.Packageclass;

public class changeclass {
    public static void main(String[] args){
        float f = 12.34f;
        Float f1 = new Float(f); // 装箱
        Float f2 = f; // 自动装箱
        System.out.println(f1);
        System.out.println(f2);   

        Double d1 = new Double(88.88);
        double d2 = d1; // 自动拆箱
        double d3 = d1;// 自动拆箱
        double d4 = d1.doubleValue(); // 拆箱
        System.out.println(d2);
    }
}
