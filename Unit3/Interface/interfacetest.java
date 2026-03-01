package src.Unit3.Interface;

public class interfacetest {
    /*
    接口里的数据成员必须初始化，且数据成员均为常量；
    接口里的方法必须全部声明为abstract，也就是说，接口不能像抽象类一样保有一般的方法，而必须全部是“抽象方法”。
    */
    public static void main(String[] args) {
		// 实例化一Student的对象s，并调用talk()方法，打印信息
		/********* begin *********/
        Student s = new Student();
        System.out.println(s.talk());
		/********* end *********/
	}
}

interface Person{
    final String name = "张三";
    final int age = 18;
    final String occupation = "学生";
    public abstract String talk();
}

class Student implements Person{
    public String talk(){
        return "我是：" + name + "，今年：" + age + "岁，我是一名" + occupation;
    }
}