package echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kystudio on 2016/6/1.
 */
public class EchoServer {
    public static void main(String[] args) {
        try {
            // 端口范围：1024-65535
            ServerSocket ss = new ServerSocket(8989);
            System.out.println("服务器已启动，正在等待连接。。。");
            // 等待客户端连接，该方法会阻塞。
            Socket socket = ss.accept();

            InputStream input = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(input));
            String info = br.readLine();
            System.out.println(info);

            OutputStream output = socket.getOutputStream();
            PrintStream ps = new PrintStream(output);
            ps.println("echo: " + info);
            output.close();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
