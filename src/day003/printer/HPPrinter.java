package day003.printer;

/**
 * Created by kystudio on 2016/6/30.
 */
public class HPPrinter implements Printer {
    @Override
    public void open() {
        System.out.println("HP open");
    }

    @Override
    public void print() {
        System.out.println("HP open");
    }

    @Override
    public void close() {
        System.out.println("HP open");
    }
}
