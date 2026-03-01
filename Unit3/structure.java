package src.Unit3;

public class structure {
    public static void main(String[] args){
        PersonStruct person = new PersonStruct("小明",20,"男");
        System.out.println("姓名：" + person.name);
        System.out.println("年龄：" + person.age);
        System.out.println("性别：" + person.sex);
    }
}

class PersonStruct{
    String name;
    int age;
    String sex;
    public PersonStruct(String n,int a,String s){
        name = n;
        age = a;
        sex = s;
    }
}