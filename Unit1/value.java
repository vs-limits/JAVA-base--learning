public class value {
    //字面量
    //告诉程序员：数据在程序中的书写格式
    /*整数，小数，字符串，字符，布尔，空类型 */
    public static void main(String[] args){
        System.out.println(676);
        System.out.println(-786);
        System.out.println(3.1415926);
        System.out.println("维纳斯李密忒");
        System.out.println('A');
        //null不能直接打印
        //要用字符串打印null
        System.out.println("name" + "\t" + "age");
        System.out.println("limit" + "\t" + 20);

        //定义变量
        int age = 20;
        System.out.println(age);
        //变量名字不能重复
        int age2 = 25;
        System.out.println(age2 + age);
        //变量使用前必须赋值，且必须有使用
    }
    //特殊字符
    // \t制表符 把字符串的长度补齐到8的倍数
    // \n换行符
}
