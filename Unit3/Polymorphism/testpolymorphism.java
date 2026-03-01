package src.Unit3.Polymorphism;

public class testpolymorphism {
    /*
    多态的三个条件:
    继承的存在(继承是多态的基础，没有继承就没有多态)；
    子类重写父类的方法(多态下调用子类重写的方法)；
    父类引用变量指向子类对象(子类到父类的类型转换)。
    */
    	public static void main(String[] args) {
		// 以多态方式分别实例化子类对象并调用eat()方法
		/********* begin *********/
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
        Animal lion = new Lion();
        lion.eat();
		/********* end *********/
	}
}

// Animal类中定义eat()方法
abstract class Animal {
	/********* begin *********/
    abstract void eat();
	/********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
	/********* begin *********/
    void eat(){
        System.out.println("eating bread...");
    }
	/********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
	/********* begin *********/
    void eat(){
        System.out.println("eating rat...");
    }
	/********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
	/********* begin *********/
    void eat(){
        System.out.println("eating meat...");
    }
	/********* end *********/
}