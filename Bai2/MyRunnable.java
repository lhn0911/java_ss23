package ss23.Bai2;

public class MyRunnable  implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Số: " + i);
        }
    }
}
