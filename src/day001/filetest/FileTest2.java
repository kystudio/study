package day001.filetest;

import java.io.File;

/**
 * Created by kystudio on 2016/4/12.
 */
public class FileTest2 {

    /*
    使用递归方式删除文件夹
     */
    public static void deleteAll(File file) {
        if (file.isFile() || file.list().length == 0) {
            // 如果是文件，或者没有东西，直接删除
            file.delete();
        } else {
            // 如果是文件夹，先删除该文件夹下的文件
            File[] files = file.listFiles();

            for (File f : files) {
                deleteAll(f);

                f.delete();
            }
        }
    }

    public static void main(String[] args) {
        deleteAll(new File("E:\\java\\test\\recursionTest"));
    }
}
