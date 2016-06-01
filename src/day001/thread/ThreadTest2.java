package day001.thread;

/**
 * Created by kystudio on 2016/5/15.
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());

        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Welcome: " + i);
                }
            }
        });
        t2.start();

        Thread t3 = new Thread(new MyThread2());

        t3.start();
    }
}

class MyThread implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello: " + i);
        }
    }
}

class MyThread2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("World: " + i);
        }
    }
}