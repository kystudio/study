package day002.abstractclass;

/**
 * Created by kystudio on 2016/6/25.
 */
public class Chinese extends Person {
    String address;

    Chinese(){
        super();
        System.out.println("Chinese的构造函数！");
    }

    Chinese(String name, int age, String address){
        super(name, age);
        this.address=address;
        System.out.println("带参数的Chinese的构造函数！");
    }

    @Override
    void eat() {
        System.out.println("我们用筷子吃饭！");
    }
}
