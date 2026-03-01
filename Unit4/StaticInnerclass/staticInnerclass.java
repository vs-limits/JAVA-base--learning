package src.Unit4.StaticInnerclass;

public class staticInnerclass {
    public static void main(String[] args){
        /*
        如果将 Inner改为 ​​静态内部类（static class Inner）​​，访问方式会发生变化
        ​不再需要先创建外部类对象​​，可以直接通过外部类名访问内部类。
        */
        Outer.Inner inner = new Outer.Inner();
        System.out.println("Inner类的成员变量i的值为：" + inner.i);
    }
}

class Outer{
    static class Inner{
        int i = 50;
    }
}