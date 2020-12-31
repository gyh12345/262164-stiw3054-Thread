package my.tzeshung;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello Thread " + Thread.currentThread().getName());
    }

    public static void main (String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        HelloThread helloThread1 = new HelloThread();
        HelloThread helloThread2 = new HelloThread();
        helloThread1.start();
        helloThread2.start();
    }
}
