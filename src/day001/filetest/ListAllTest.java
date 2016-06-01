package day001.filetest;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by kystudio on 2016/4/17.
 */
public class ListAllTest {

    private static int times;

    //  递归的方式
    public static void deepList(File file) {
        if (file.isFile() || 0 == file.listFiles().length) {
            return;
        } else {
            File[] files = file.listFiles();

            files = sort(files);

            for (File f : files) {
                StringBuffer output = new StringBuffer();

                if (f.isFile()) {
                    output.append(getTabs(times));
                    output.append(f.getName());
                } else {
                    output.append(getTabs(times));
                    output.append(f.getName());
                    output.append("\\");
                }

                System.out.println(output);

                if (f.isDirectory()) {
                    times++;

                    deepList(f);

                    times--;
                }
            }
        }
    }

    private static File[] sort(File[] files) {
        ArrayList<File> sorted = new ArrayList<File>();

        //  先添加目录到ArrayList
        for (File f : files) {
            if (f.isDirectory()) {
                sorted.add(f);
            }
        }

        //  再添加文件到ArrayList
        for (File f : files) {
            if (f.isFile()) {
                sorted.add(f);
            }
        }

        return sorted.toArray(new File[files.length]);
    }

    private static String getTabs(int times) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < times; i++) {
            buffer.append("\t");
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        //File file=new File("E:\\html学习");
        File file = new File("E:\\java\\test");

        deepList(file);
    }
}
