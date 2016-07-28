package day005.serverthread;

import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class ClientInputThread extends Thread {
    private Socket socket;

    public ClientInputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Utils.myInputStream(socket);
    }
}
