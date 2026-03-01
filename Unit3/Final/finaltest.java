package src.Unit3.Final;

public class finaltest{
    public static void main(String[] args){
        /*
        final标记的类不能被继承；
        final标记的方法不能被子类复写；
        final标记的变量（成员变量或局部变量）即为常量，只能赋值一次。
        */
        bike obj = new bike();
        obj.run();

        Honda honda = new Honda();
        honda.run();

        Yamaha yamaha = new Yamaha();
        yamaha.run();
    }
}

class bike{
    int speedlimit = 90;
    void run(){
        speedlimit = 120;
        System.out.println("bike speedlimit:" + speedlimit);
    }
}
class bike2{
    void run(){
        System.out.println("bike2 is running");
    }
}

class Honda extends bike2{
    void run(){
        System.out.println("running safely with 100kmph");
    }
}

class Bike3 {
}

class Yamaha extends Bike3 { 
	void run() {
		System.out.println("running safely with 100kmph");
	}

}