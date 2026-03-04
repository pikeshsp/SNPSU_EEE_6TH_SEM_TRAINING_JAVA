package Threads.ControlOverthreadExecution;

class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Thread in Running " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e) {
            }
        }
    }
}
public class Demo {
    static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread is Running " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

