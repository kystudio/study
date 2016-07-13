package day003.printer;

/**
 * Created by kystudio on 2016/6/30.
 */
public class PrinterFactory {
    public static Printer getPrinter(int flag){
        Printer printer = null;
        if (flag == 0) {
            printer = new CanonPrinter();
        } else if (flag == 1) {
            printer = new HPPrinter();
        }

        return  printer;
    }
}
