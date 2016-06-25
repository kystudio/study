package day002.overload;

/**
 * Created by kystudio on 2016/6/25.
 */
public class People {
    String name;
    int age;
    String address;

    People() {
        System.out.println("没有参数的构造函数！");
    }

    People(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("有两个参数的构造函数！");
    }

    People(String name, int age, String address) {
        this(name, age);//this(...)只能是函数的第一条语句
        this.address = address;
        System.out.println("有三个参数的构造函数！");
    }

}
