package day002.abstractclass;

import day002.overload.People;

/**
 * Created by kystudio on 2016/6/25.
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Chinese();
        p.eat();

        System.out.println("--------------");

        Person p1 = new Chinese("Tom",12,"beijing");
        p1.eat();
    }
}
