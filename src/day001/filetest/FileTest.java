package day001.filetest;

import java.io.File;
import java.io.IOException;

/**
 * Created by kystudio on 2016/4/12.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        /*
        三种文件分隔符
        1.d:\\test.txt
        2.d:/test.txt
        3.File.separator

        ps:直接用File.separator 表示当前class文件所在目录的根目录
         */
        //File file = new File("d:/test.txt");
        //File file = new File("d:"+ File.separator + "test1.txt");
        File file = new File(File.separator); //表示当前class文件所在目录的根目录
        File file2 = new File(file, "test2.txt");
        System.out.println(file2.createNewFile());


    }
}
