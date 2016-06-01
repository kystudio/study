package day001.io;

import java.io.*;

/**
 * Created by kystudio on 2016/4/29.
 */
public class DataStream1 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));

        byte b = 3;
        int i = 12;
        char ch = 'a';
        float f = 3.3f;

        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(ch);
        dos.writeFloat(f);

        dos.close();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));

        // 读和写的顺序要保持一致
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();
    }
}
