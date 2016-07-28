package day005.serverthread;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class MainServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);

        while (true) {
            Socket socket = serverSocket.accept();

            // 启动读写线程
            new ServerInputThread(socket).start();
            new ServerOutputThread(socket).start();
        }
    }
}
