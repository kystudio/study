package day003.printer;

/**
 * Created by kystudio on 2016/6/30.
 */
public class CanonPrinter implements Printer {
    @Override
    public void open() {
        System.out.println("Canon open");
    }

    @Override
    public void print(String s) {
        System.out.println("Canon print---->" + s);
        System.out.println("clean");
    }

    @Override
    public void close() {
        System.out.println("Canon close");
    }
}
