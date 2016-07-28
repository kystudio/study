package day005.serverthread;

import java.io.*;
import java.net.Socket;

/**
 * Created by kystudio on 2016/7/28.
 */
public class Utils {
    public static void myInputStream(Socket socket) {
        try {
            InputStream is = socket.getInputStream();
            while (true) {
                byte[] buffer = new byte[1024];

                int len = is.read(buffer);

                String myStr = new String(buffer, 0, len);

                System.out.printf(myStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void myOutPutStream(Socket socket) {
        try {
            OutputStream os = socket.getOutputStream();
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String line = reader.readLine();

                os.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
