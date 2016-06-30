package day003.printer;

/**
 * Created by kystudio on 2016/6/30.
 */
public class Test {
    public static void main(String[] args) {
        Printer printer = null;

        int flag = 1;

        if (flag == 0) {
            printer = new CanonPrinter();
        } else if (flag == 1) {
            printer = new HPPrinter();
        }

        printer.open();
        printer.print();
        printer.close();
    }
}
