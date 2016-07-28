package day005.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kystudio on 2016/7/27.
 */
public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("服务器已启动，正在等待连接。。。");

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        byte[] buffer = new byte[200];
        int len = 0;

        while (-1 != (len = is.read(buffer, 0, buffer.length))) {
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }

        OutputStream os = socket.getOutputStream();

        os.write("Welcome!".getBytes());
    }
}
