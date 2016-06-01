package day001.io2;

import java.io.*;

/**
 * Created by kystudio on 2016/5/12.
 */
public class SerializableTest2 {

    public static void main(String[] args) throws Exception {
        Person2 p1 = new Person2(20, "Zhangsan", 4.55);
        Person2 p2 = new Person2(50, "Lisi", 4.67);
        Person2 p3 = new Person2(10, "Wangwu", 3.78);

        FileOutputStream fos = new FileOutputStream("Person2.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();


        System.out.println("------------下面的是反序列化结果-------------");

        FileInputStream fis = new FileInputStream("Person2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person2 p = null;

        for (int i = 0; i < 3; i++) {
            p = (Person2) ois.readObject();
            System.out.println(p.toString());
        }

        ois.close();
    }

}

class Person2 implements Serializable {
    int age;

    String name;
    //transient String name;//transient 修饰了的变量不会被序列化

    double height;

    public Person2(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    /**
     * 自定义writeObject方法
     * @param out
     * @throws IOException
     */
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(age);
        out.writeUTF(name);

        System.out.println("write object");
    }

    /**
     * 自定义readObject方法
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        age = in.readInt();
        name = in.readUTF();

        System.out.println("read object");
    }

}