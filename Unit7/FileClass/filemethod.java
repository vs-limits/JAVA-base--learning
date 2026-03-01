package src.Unit7.FileClass;
import java.io.File;
//import java.io.FileFilter;
import java.io.IOException;
//import java.util.Arrays;


public class filemethod {
	public static void dcFile() throws IOException {
		/********* Begin *********/
		File file = new File("src/Unit7/test2");
        file.mkdir();//创建目录test2
		System.out.println("output目录结构为：");
        File file1 = new File("src/output/test2.txt");
        file1.delete();
        File dir = new File("src/output");
        File[] files = dir.listFiles();//列出output目录下的所有文件和子目录
        for(File f : files){
            System.out.println(f.getName());
        }

		System.out.println("test2目录结构为：");
        File file2 = null;
        File file3 = null;
        try{
            file2 = new File("src/test2/helloworld.txt");
            file3 = new File("src/test2/step2.txt");
            file2.createNewFile();
            file3.createNewFile();
        }catch(IOException e) {
            e.printStackTrace();
        }
        File dir1 = new File("src/test2");
        File[] files1 = dir1.listFiles();//列出test2目录下的所有文件和子目录
        for(File f : files1){
            System.out.println(f.getName());
        }
		/********* End *********/
	}
}
