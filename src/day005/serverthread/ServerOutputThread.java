package day005.serverthread;

import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class ServerOutputThread extends Thread {
    private Socket socket;

    public ServerOutputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Utils.myOutPutStream(socket);
    }
}
