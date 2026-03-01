package src.Unit3;

public class createclass {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "小白";
        dog.age = 3;
        dog.type = "拉布拉多";
        System.out.println("狗的名字是：" + dog.name);
        System.out.println("狗的年龄是：" + dog.age);
        System.out.println("狗的品种是：" + dog.type);
        dog.bark();
    }
}

class Dog{
    String name;
    int age;
    String type;
    void bark(){
        System.out.println("旺旺旺");
    }

}