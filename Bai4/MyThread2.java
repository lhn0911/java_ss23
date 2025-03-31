package ss23.Bai4;

public class MyThread2 extends Thread {
    private final Thread threadToWait;

    public MyThread2(Thread threadToWait) {
        this.threadToWait = threadToWait;
    }

    @Override
    public void run() {
        try {
            threadToWait.join();
            System.out.println("Thread 2 bắt đầu...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
