package day001.io;

import java.io.*;

/**
 * Created by kystudio on 2016/5/4.
 */
public class StreamTest {
    public static void main(String[] args) throws Exception {
        //  下面代码是往文件file.txt写入内容
        FileOutputStream fos = new FileOutputStream("file.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("https://www.googls.com");
        bw.write("\n");
        bw.write("https://www.baidu.com");

        bw.close();

        //  下面代码是从文件file.txt读取内容
        FileInputStream fis = new FileInputStream("file.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        while (null !=str)
        {
            System.out.println(str);

            str=br.readLine();
        }

        br.close();
    }
}
