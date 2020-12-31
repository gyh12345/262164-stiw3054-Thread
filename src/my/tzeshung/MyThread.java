package my.tzeshung;

public class MyThread extends Thread{

    static int i = 0;

    public void run() {
        System.out.println("running..." + i++);
    }


    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName() + i++);
        System.out.println("Name of t2:" + t2.getName() + i++);
        System.out.println("id of t1:" + t1.getId() + ++i);

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName() + --i);
        System.out.println("i = " + i);
    }

    /*
    class A extends Runnable {public void run() {}}

    class B extends Object {public void run() {}}

    class C implements Runnable {public void run() {}}

    class D implements Runnable {void run() {}}

    class E implements Runnable {public void start() {}}
     */

}
