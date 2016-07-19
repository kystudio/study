package day04.urlconnection;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by kystudio on 2016/7/19.
 */
public class UrlConnectionTest {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com");

        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();

        OutputStream os = new FileOutputStream("./out/baidu.txt");

        byte[] buffer = new byte[2048];
        int length = 0;

        while (-1 != (length = is.read(buffer, 0, buffer.length))) {
            os.write(buffer, 0, length);
        }

        is.close();
        os.close();
    }
}
