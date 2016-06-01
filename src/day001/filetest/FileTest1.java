package day001.filetest;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by kystudio on 2016/4/12.
 */
public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("D:\\JetBrains");

/*        String[] names = file.list();

        for (String name:names ) {
            System.out.println(name);
        }*/

        String[] names = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".zip")){
                    return true;
                }
                return false;
            }
        });

        for (String name:names ) {
            System.out.println(name);
        }
    }
}
