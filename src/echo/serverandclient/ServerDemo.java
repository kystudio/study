package echo.serverandclient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kystudio on 2016/6/2.
 */
public class ServerDemo {
    public static void main(String[] args) {
        // 线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        //用于存储客户端的服务线程
        Vector<ClientThread> list = new Vector<ClientThread>();

        try {
            // 端口范围：1024-65535
            ServerSocket ss = new ServerSocket(9091);
            System.out.println("服务器已启动，正在等待连接。。。");

            while (true) {
                // 等待客户端连接，该方法会阻塞。
                Socket socket = ss.accept();
                ClientThread c = new ClientThread(socket, list);
                executorService.execute(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientThread implements Runnable {
        private Socket socket;
        private Vector<ClientThread> list;
        private String name;
        private ObjectOutputStream out;

        public ClientThread(Socket socket, Vector<ClientThread> list) {
            list.add(this);
            this.list = list;
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println("客户端的IP为:" + socket.getInetAddress().getHostAddress());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                out = new ObjectOutputStream(socket.getOutputStream());

                while (true) {
                    Info info = (Info) in.readObject();
                    if (info.getType() == 0) {
                        name = info.getFrom();
                        Info welcome = new Info();
                        welcome.setInfo("welcome! " + name);
                        out.writeObject(welcome);
                    } else if (info.getType() == 1) {
                        for (int i = 0; i < list.size(); i++) {
                            ClientThread ct = list.get(i);
                            if (ct.name.equals(info.getTo())) {
                                ct.out.writeObject(info);
                                break;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
