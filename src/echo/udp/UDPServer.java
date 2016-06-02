package echo.udp;

import java.io.IOException;
import java.net.*;

/**
 * 发送端
 * Created by kystudio on 2016/6/2.
 */
public class UDPServer {
    public static void main(String[] args) {
        String info = "欢迎来到移动开发课堂！";
        byte[] bytes = info.getBytes();

        try {
            DatagramPacket dp = new DatagramPacket(bytes,0, bytes.length, InetAddress.getByName("127.0.0.1"),8000);
            DatagramSocket ds = new DatagramSocket(9000);
            ds.send(dp);
            ds.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
