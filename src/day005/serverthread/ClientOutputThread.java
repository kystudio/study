package day005.serverthread;

import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class ClientOutputThread extends Thread {
    private Socket socket;

    public ClientOutputThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Utils.myOutPutStream(socket);
    }
}
