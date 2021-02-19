package edu.zxie0018;

public class VarSafe {
    private static class Var {
        public static int num = 3;
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            Var.num--;
            System.out.println("Num is " + Var.num);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
