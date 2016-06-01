package day001.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kystudio on 2016/5/4.
 */
public class StreamTest2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str;

        while (null != (str = br.readLine())) {
            System.out.println("You type in :\n"+str);
        }

        br.close();
    }
}
