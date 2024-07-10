package org.example;

// define a class named MyThread that extends the thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getId() + " Value " + i);

            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
