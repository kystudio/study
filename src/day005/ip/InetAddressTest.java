package day005.ip;

import java.net.InetAddress;

/**
 * Created by kystudio on 2016/7/27.
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.baidu.com");

        System.out.println(address);
    }
}
