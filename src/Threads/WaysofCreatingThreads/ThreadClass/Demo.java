package Threads.WaysofCreatingThreads.ThreadClass;

class MyThread extends  Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("Thread is Running...");

        }
    }
}
public class Demo {
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i <100 ; i++) {
            System.out.println("Main thread is Running...");

        }
    }
}
