package day001.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kystudio on 2016/4/14.
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("E:\\java\\test\\recursionTest\\1.txt");
        byte[] buffer = new byte[200];

        int length = 0;

        while (-1 != (length = inputStream.read(buffer, 0, 200))) {
            String str = new String(buffer, 0, length);

            System.out.println(str);
        }
        inputStream.close();
    }
}
