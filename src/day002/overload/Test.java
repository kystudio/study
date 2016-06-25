package day002.overload;

/**
 * Created by kystudio on 2016/6/25.
 */
public class Test {
    public static void main(String[] args) {
        People p1 = new People();

        System.out.println("************");

        People p2 = new People("Andy",24);

        System.out.println("************");

        People p3 = new People("kitty",25,"beijing");
    }
}
