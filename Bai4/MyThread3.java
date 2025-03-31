package ss23.Bai4;

public class MyThread3 extends Thread {
    private final Thread threadToWait;

    public MyThread3(Thread threadToWait) {
        this.threadToWait = threadToWait;
    }

    @Override
    public void run() {
        try {
            threadToWait.join();
            System.out.println("Thread 3 bắt đầu...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
