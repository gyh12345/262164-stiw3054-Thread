package my.tzeshung;

public class MyRunnable implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
