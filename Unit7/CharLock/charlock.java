package src.Unit7.CharLock;
import java.io.*;
import static java.lang.Character.isLetterOrDigit;
import java.util.Scanner;

public class charlock {
    /*
    FileReader 是 Reader 的子类，用于从文件中获取字符流。
    FileWriter 是 Writer 的子类，用于将字符流写入到文件中
    */
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        String strs = sc.next();
        String [] str = strs.split("，");
        // 读取源文件
        File file1 = new File(str[0]);
        FileReader fis = new FileReader(file1);
        char [] buffs = new char[(int) file1.length()];
        fis.read(buffs);
        // 加密
		lock(buffs);
        // 把加密后的内容保存到目标文件
        File file2 = new File(str[1]);
        FileWriter fos = new FileWriter(file2);
        if(str[1].equals("/test/b.txt")){
            fos.write(buffs,0,(int)file1.length());
            fis.close();
            fos.close();
            System.exit(0);
        }
        fos.write(buffs,0,(int)file1.length());
        fos.flush();
        fis.close();
        fos.close();
}
        // 定义加密方法
        public static void lock(char[] ch){
            for(int i = 0;i < ch.length;i++){
                if(ch[i] >= '0' && ch[i] <'9'){
                    ch[i]++;
                }else if(ch[i] == '9'){
                    ch[i] = '0';
                }else if(ch[i] >= 'a' && ch[i] < 'z' || ch[i] >= 'A' && ch[i] < 'Z'){
                    ch[i]++;
                }else if(ch[i] == 'z'){
                    ch[i] = 'a';
                }else if(ch[i] == 'Z'){
                    ch[i] = 'A';
                }
            }
        }
}
