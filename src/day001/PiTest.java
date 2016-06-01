package day001;

/**
 * Created by kystudio on 2016/4/28.
 */
public class PiTest {
    public static void main(String[] args) {
        double p = 0;
        double pi = 0;
        final int maxValue = Integer.MAX_VALUE;

        for (int i = 0; i < 200000000; i++) {
            if (0 == (i + 1) % 2) {
                p -= 1.0 / (2 * i + 1);
            } else {
                p += 1.0 / (2 * i + 1);
            }
        }
        System.out.println(p);

        pi = 4 * p;

        System.out.println(pi);
    }
}
