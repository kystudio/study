package echo.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 接收端
 * Created by kystudio on 2016/6/2.
 */
public class UDPClient {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        try {
            DatagramSocket ds = new DatagramSocket(8000);
            System.out.println("正在接收中...");
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
