package day001.thread;

/**
 * Created by kystudio on 2016/5/20.
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        Runnable r = new HelloThread();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class HelloThread implements Runnable {
    //  成员变量
    //int i;

    @Override
    public void run() {
        //  局部变量
        int i = 0;
        while (true) {
            System.out.println("number: " + i++);

            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (50 == i) {
                break;
            }
        }
    }
}
