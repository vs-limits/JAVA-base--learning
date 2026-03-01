package src.Unit4.Lambda;

public class lambdatest {
    public static void main(String[] args){
        Addble ad1 = (a,b) -> (a-b);
        System.out.println(ad1.add(10,20));

        Addble ad2 = (int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));
    }
}

interface Addble{
    int add(int a,int b);
}