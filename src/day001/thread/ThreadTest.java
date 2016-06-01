package day001.thread;

/**
 * Created by kystudio on 2016/5/15.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World: " + i);
        }
    }
}

class Thread2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome: " + i);
        }
    }
}