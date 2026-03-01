package src.Unit4.Autounfold;

public class autounfold {
    public static void main(String[] args){
        /*
        无需手动调用 Integer.valueOf()或 intValue()，Java 自动完成转换。
        */
        Integer A = 3;
        int a = A;
        System.out.println(a);

        Integer A1 = 3;
        System.out.println(A == A1);

        A = 129;
        A1 = 129;
        System.out.println(A);
        System.out.println(A1);
        /*
        129超出了-128到127的范围，所以A和A1指向不同的对象，结果为false
        */
        System.out.println(A == A1);
    }
}
/*
基本数据类型：byte、short、int、long、float、double、char、boolean
包装类：Byte、Short、Interger、Long、Float、Double、Character、Boolean
*/
