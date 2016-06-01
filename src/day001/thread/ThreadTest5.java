package day001.thread;

/**
 * Created by kystudio on 2016/5/28.
 */
public class ThreadTest5 {
    public static void main(String[] args) {
        Example2 e = new Example2();

        TheThread3 t3 = new TheThread3(e);
        TheThread4 t4 = new TheThread4(e);

        t3.start();
        t4.start();
    }
}

class Example2 {
    //private Object object = new Object();

    public void execute() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("h: " + i);
            }
        }
    }

    public void execute2() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("w: " + i);
            }
        }
    }
}

class TheThread3 extends Thread {
    private Example2 example;

    public TheThread3(Example2 example) {
        this.example = example;
    }

    @Override
    public void run() {
        this.example.execute();
    }
}

class TheThread4 extends Thread {
    private Example2 example;

    public TheThread4(Example2 example) {
        this.example = example;
    }

    @Override
    public void run() {
        this.example.execute2();
    }
}