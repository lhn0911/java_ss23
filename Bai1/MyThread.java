package ss23.Bai1;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread đang chạy: " + getName());
    }
}
