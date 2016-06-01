package day001.decorator;

/**
 * Created by kystudio on 2016/5/2.
 */
public class ConcreteDecrator1 extends Decorator {
    public ConcreteDecrator1(Component component)
    {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();

        this.doAnotherThing();
    }

    private void doAnotherThing()
    {
        System.out.println("功能B");
    }
}
