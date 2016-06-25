package day002.abstractclass;

/**
 * Created by kystudio on 2016/6/25.
 */
abstract class Person {
    String name;
    int age;

    Person() {
        System.out.println("Person的构造函数！");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("我的名字是" + name + "，我今年" + age + "岁。");
    }

    abstract void eat();
}
