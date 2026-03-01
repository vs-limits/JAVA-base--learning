package src.Unit3;

public class overriding {
    	public static void main(String[] args) {
		// 实例化子类对象s，调用talk()方法打印信息
		/********* begin *********/
        Student3 s = new Student3("张三",18,"哈佛大学");
        s.talk();
		/********* end *********/
		
	}
}

class Person {
	/********* begin *********/
    protected String name;
    protected int age;
    void talk(){
        System.out.println("我是：" + name + "，今年：" + age + "岁");
    }
	/********* end *********/
}

class Student3 extends Person {
	/********* begin *********/
    protected String school;
    Student3(String name,int age,String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
    public void talk(){
        System.out.println("我是：" + name + "，今年：" + age + "岁，我在" + school + "上学");
    }
	/********* end *********/
}
