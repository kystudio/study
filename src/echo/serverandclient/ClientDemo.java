package echo.serverandclient;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by kystudio on 2016/6/2.
 */
public class ClientDemo {
    public static void main(String[] args) {
        String host = "localhost";
        // 连接服务器
        try {
            Socket socket = new Socket(host, 9091);
            System.out.println("连接成功！");

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Scanner input = new Scanner(System.in);
            System.out.println("请输入姓名：");
            String name = input.nextLine();
            Info info = new Info();
            info.setFrom(name);
            info.setType(0);//表示登录
            out.writeObject(info);
            info = (Info) in.readObject();//系统返回的信息
            System.out.println(info.getInfo());

            new Thread(new ReadInfoThread(in)).start();
            boolean flag = true;
            while (flag) {
                info = new Info();
                System.out.println("to:");
                info.setTo(input.nextLine());
                System.out.println("info:");
                info.setInfo(input.nextLine());
                info.setFrom(name);
                info.setType(1);

                out.writeObject(info);
            }
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 接收消息的线程
     */
    static class ReadInfoThread implements Runnable {
        private ObjectInputStream in;
        public boolean flag = true;

        public ReadInfoThread(ObjectInputStream in) {
            this.in = in;
            flag = true;
        }

        @Override
        public void run() {
            while (flag) {
                try {
                    Info info = (Info) in.readObject();
                    System.out.println(info);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
