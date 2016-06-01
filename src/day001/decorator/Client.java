package day001.decorator;

/**
 * Created by kystudio on 2016/5/2.
 */
public class Client {
    public static void main(String[] args) {
        //  相当于节点流
        //Component component = new ConcreteComponent();

        //  相当于过滤流
        //Component component2 = new ConcreteDecrator1(component);

        //  相当于过滤流
       //Component component3 = new ConcreteDecrator2(component2);

        //component3.doSomething();

        //  另一种方式
        Component component = new ConcreteDecrator2(new ConcreteDecrator1(new ConcreteComponent()));

        component.doSomething();

    }
}
