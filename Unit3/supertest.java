package src.Unit3;

public class supertest {
	public static void main(String[] args) {
        Student2 s = new Student2("张三",18);
        s.school = "哈佛大学";
        System.out.println("姓名：" + s.name + "，年龄：" + s.age + "，学校：" + s.school);
	}
}

class Person2 {
    String name;
    int age;
    Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Student2 extends Person2 {
    protected String school;
    Student2(String name,int age){
        super(name,age);
    }
}
