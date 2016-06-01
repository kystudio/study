package day001.io2;

import java.io.*;

/**
 * Created by kystudio on 2016/5/12.
 */
public class SerializableTest1 {

    public static void main(String[] args) throws Exception {
        Person1 p1 = new Person1(20,"Zhangsan",4.55);
        Person1 p2 = new Person1(50,"Lisi",4.67);
        Person1 p3 = new Person1(10,"Wangwu",3.78);

        FileOutputStream fos = new FileOutputStream("Person1.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();


        System.out.println("------------下面的是反序列化结果-------------");

        FileInputStream fis = new FileInputStream("Person1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person1 p = null;

        for (int i = 0; i <3 ; i++) {
            p = (Person1) ois.readObject();
            System.out.println(p.toString());
        }

        ois.close();

    }



}

class Person1 implements Serializable
{
    int age;

    String name;
    //transient String name;//transient 修饰了的变量不会被序列化

    double height;

    public Person1(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}