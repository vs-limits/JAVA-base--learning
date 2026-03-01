package src.Unit5.Random;
import java.util.Random;
import java.util.Scanner;

public class randomclass {
    public static void main(String[] args) {
        char[] pardStore = new char[62];
        for(int i = 0;i < 26;i++){
            pardStore[i] = (char)('A' + i);
            pardStore[i + 26] = (char)('a' + i);
        }
        for(int i = 0;i < 10;i++){
            pardStore[i + 52] = (char)('0' + i);
        }

        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        Random r = new Random(seed);
        String str = "";
        int[] arr = r.ints(6,0,62).toArray();
        for(int i = 0;i < 6;i++){
            str += pardStore[arr[i]];
        }

        System.out.println(str);
    }
}
