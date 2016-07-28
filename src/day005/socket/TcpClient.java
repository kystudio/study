package day005.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by kystudio on 2016/7/27.
 */
public class TcpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",5000);

        OutputStream os = socket.getOutputStream();

        os.write("Hello,World!".getBytes());

        InputStream is = socket.getInputStream();

        byte[] buffer = new byte[200];
        int len = 0;

        while (-1 != (len = is.read(buffer, 0, buffer.length))) {
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }
    }
}
