package src.Unit3.Abstract;

public class abstractTest {
    public static void main(String[] args) {
		/********* begin *********/
		// 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
		Student stu = new Student("张三",20,"学生");
        Worker wker = new Worker("李四",30,"工人");
		// 分别调用各自类中被复写的talk()方法 打印信息。
		stu.talk();
        wker.talk();
	}
}

abstract  class Person{
    String name;
    int age;
    String occupation;
    abstract void talk();
}

class Student extends Person{
    Student(String name,int age,String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    void talk(){
        System.out.println("我是：" + name + "，今年：" + age + "岁，我是一名" + occupation);
    }
}

class Worker extends Person{
    Worker(String name,int age,String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    void talk(){
        System.out.println("我是：" + name + "，今年：" + age + "岁，我是一名" + occupation);
    }
}
