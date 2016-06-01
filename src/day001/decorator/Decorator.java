package day001.decorator;

/**
 * Created by kystudio on 2016/5/2.
 */
public class Decorator implements Component {
    private  Component component;

    public  Decorator(Component component)
    {
        this.component=component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
    }
}
