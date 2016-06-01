package echo;

import java.io.*;
import java.net.Socket;

/**
 * Created by kystudio on 2016/6/1.
 */
public class EchoClientDemo {
    public static void main(String[] args) {
        String host="localhost";
        // 连接服务器
        try {
            Socket socket = new Socket(host,8989);
            System.out.println("连接成功！");

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            PrintStream ps = new PrintStream(out);
            ps.println("hello!");

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String info = br.readLine();
            System.out.println(info);

            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
