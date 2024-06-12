package Multithreading;

 class MyThread extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        System.out.println("Welcome "+name);
    }

}

public class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();

        MyThread t1=new MyThread();

        t.yield();
        t.start();
        t1.setName("Satheesh");
        t1.start();

    }

}
