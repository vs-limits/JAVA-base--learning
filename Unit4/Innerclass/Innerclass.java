package src.Unit4.Innerclass;

public class Innerclass {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner类的成员变量i的值为：" + inner.i);
    }
}

class Outer{
    class Inner{
        int i = 50;
    }
}