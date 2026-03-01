package src.Unit5.Packageclass;

public class changeclass2 {
    public static void main(String[] args){
        int score = 87;

        Integer score1 = score; // 自动装箱
        double score2 = score1.doubleValue(); // 拆箱
        float score3 = score1.floatValue(); // 拆箱
        int score4 = score1; // 自动拆箱
        System.out.println(score1);
        System.out.println(score2); 
        System.out.println(score3);
        System.out.println(score4);
    }
}
