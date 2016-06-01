package day001.io;

import java.io.RandomAccessFile;

/**
 * Created by kystudio on 2016/5/9.
 */
public class RandomAccessFile1 {
    public static void main(String[] args) throws Exception {
        Person p = new Person(1,"kylin",5.42);

        RandomAccessFile randomAccessFile = new RandomAccessFile("raf_test.txt","rw");

        p.write(randomAccessFile);

        //  让读的位置重回到文件开头
        randomAccessFile.seek(0);

        Person p2 = new Person();

        p2.read(randomAccessFile);

        System.out.println(p2.getId()+", "+p2.getName()+", "+p2.getHeight());
    }
}

class Person
{
    int id;
    String name;
    double height;

    public Person() {

    }

    public Person(int id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public void write(RandomAccessFile randomAccessFile) throws Exception {
        randomAccessFile.writeInt(this.id);
        randomAccessFile.writeUTF(this.name);
        randomAccessFile.writeDouble(this.height);
    }

    public void read(RandomAccessFile randomAccessFile) throws Exception
    {
        this.id=randomAccessFile.readInt();
        this.name = randomAccessFile.readUTF();
        this.height=randomAccessFile.readDouble();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
