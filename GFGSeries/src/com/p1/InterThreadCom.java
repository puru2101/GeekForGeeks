package com.p1;

public class InterThreadCom implements Runnable {
    static boolean t1Created = false;
    static boolean t2Created = false;
    static boolean t3Created = false;

    public static void main(String[] args) throws InterruptedException {

        InterThreadCom t1 = new InterThreadCom();
        Thread th1 = new Thread(t1, "Thread 1");

        InterThreadCom t2 = new InterThreadCom();
        Thread th2 = new Thread(t2, "Thread 2");

        InterThreadCom t3 = new InterThreadCom();
        Thread th3 = new Thread(t3, "Thread 3");

        if (!t1Created&& !t2Created&& !t3Created) {
            th1.start();
            t1Created = true;
        }

        if (t1Created && !t2Created&& !t3Created) {
            th2.start();
           Thread.sleep(200);
            t2Created = true;
        }

        if (t1Created && t2Created && !t3Created) {
            th3.start();
            Thread.sleep(300);
            t3Created = true;
        }
    }

    @Override
    public synchronized void run() {
            System.out.println(Thread.currentThread().getName() + " " );
         
    }
}
