package day005.serverthread;

import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class MainClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",5000);

        new ClientInputThread(socket).start();
        new ClientOutputThread(socket).start();
    }
}
