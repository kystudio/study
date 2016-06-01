package echo.multiclient;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by kystudio on 2016/6/1.
 */
public class MultiClientDemo {
    public static void main(String[] args) {
        String host = "localhost";
        // 连接服务器
        try {
            Socket socket = new Socket(host, 9090);
            System.out.println("连接成功！");

            PrintStream out = new PrintStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner input = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("请输入：");
                String info = input.nextLine();
                if ("bye".equals(info)) {
                    flag = false;
                }
                out.println(info);
                info = in.readLine();
                System.out.println(info);
            }
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
