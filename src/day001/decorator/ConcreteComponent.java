package day001.decorator;

/**
 * Created by kystudio on 2016/5/2.
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething()
    {
        System.out.println("功能A");
    }
}
