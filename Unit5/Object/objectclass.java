package src.Unit5.Object;
import java.util.Scanner;

public class objectclass {
    /*
    它是所有类的父类
    如果一个类没有使用extends关键字明确标识继承另外一个类
    那么这个类就默认继承 Object 类

    Object类的常用方法有： toString()和equals()方法
    "==" 但是如果用于引用类型的比较，则是比较所指向对象的地址是否相等
    在这点上，跟object类提供的equals()方法的作用是一致的
    */
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Demo d1 = new Demo(num1);
        System.out.println(d1.toString());
        Demo d2 = new Demo(num2);
        System.out.println(d2.equals(d1));

        Person p1 = new Person(num1);
        System.out.println(d1.equals(p1));
        System.out.println(p1.toString());

   }
}

class Demo{
    private int num;
    public Demo(int num){
        this.num = num;
    }

    public String toString(){
        return "Demo:" + num;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Demo)){//检查obj是否是Demo类的对象
            return false;
        }
        Demo d = (Demo) obj;
        return this.num == d.num;
    }
}

class Person{
    private int num;
    public Person(int num){
        this.num = num;
    }
}