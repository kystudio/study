package day005.serverthread;

import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class ServerInputThread extends Thread {
    private Socket socket;

    public ServerInputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Utils.myInputStream(socket);
    }


}
