package echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kystudio on 2016/6/1.
 */
public class MultiServer {
    public static void main(String[] args) {
        // 线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        try {
            // 商品范围：1024-65535
            ServerSocket ss = new ServerSocket(9090);
            System.out.println("服务器已启动，正在等待连接。。。");

            while (true) {
                // 等待客户端连接，该方法会阻塞。
                Socket socket = ss.accept();

                executorService.execute(new ClientThread(socket));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientThread implements Runnable {
        private Socket socket;

        public ClientThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            InputStream input = null;
            try {
                System.out.println("客户端的IP为：" + socket.getInetAddress());
                input = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintStream ps = new PrintStream(output);

                while (true) {
                    String info = br.readLine();
                    if (info==null || "bye".equals(info))
                    {
                        break;
                    }
                    System.out.println(info);
                    ps.println("echo: " + info);
                }
                output.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
