package day002.test;

/**
 * 打印100-200内的素数
 * Created by kystudio on 2016/6/25.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag;
        for (int i = 100; i <= 200; i++) {
            flag = false;
            for (int j = 2; j < i; j++) {
                if (0 == i % j) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.print(i + " ");
            }
        }
    }
}
