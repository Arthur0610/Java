package edu.zxie0018;

public class ExtendsThread {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(this.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        Thread t = new MyThread();
        t.start();
    }
}
