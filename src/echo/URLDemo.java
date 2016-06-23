package echo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by kystudio on 2016/6/2.
 */
public class URLDemo {
    public static void main(String[] args) throws IOException {
        // 下载一张图片
        URL url = new URL("http://image.tianjimedia.com/uploadImages/2012/233/38/H439I0N71ARI.jpg");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();

        BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./out/abc.jpg"));

        byte[] bytes = new byte[1024];
        int len = -1;

        while ((len = bis.read(bytes))!=-1)
        {
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        System.out.println("下载成功！");
    }
}
