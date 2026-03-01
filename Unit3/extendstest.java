package src.Unit3;
public class extendstest {
	public static void main(String args[]) {
		// 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
        Cat p1 = new Cat();
        p1.name = "大花猫";
        p1.age = 6;
        p1.voice();
        p1.eat();
        System.out.println(p1.name + p1.age + "岁");
		/********* end *********/

		// 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
        // Dog p2 = new Dog();
        // p2.name = "大黑狗";
        // p2.age = 8;
        // p2.voice();
        // p2.eat();
        // System.out.println(p2.name + p2.age + "岁");
		/********* end *********/
	}
}

class Animal {
	/********* begin *********/
    protected String name;
    protected int age;
    public String getName(){
       return name;
     }
     public void setName(String name){
         this.name = name;
     }

     public int getAge(){
        return age;
     }
     public void setAge(int age){
         this.age = age ;
     }
	/********* end *********/
}

class Cat extends Animal {
	// 定义Cat类的voice()和eat()方法
	/********* begin *********/
    public void voice(){
        System.out.println(name + "喵喵叫");
    }
    public void eat(){
        System.out.println(name + "吃鱼");
    }
	/********* end *********/
}

// class Dog extends Animal {
// 	// 定义Dog类的voice()和eat()方法
// 	/********* begin *********/
//     public void voice(){
//         System.out.println(name + "汪汪叫");
//     }
//     public void eat(){
//         System.out.println(name + "吃骨头");
//     }
// 	/********* end *********/
// }