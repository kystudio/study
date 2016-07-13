package day003.printer;

/**
 * Created by kystudio on 2016/6/30.
 */
public class Test {
    public static void main(String[] args) {
        int flag = 0;

        Printer printer = PrinterFactory.getPrinter(flag);

        printer.open();
        printer.print("test");
        printer.close();
    }
}
