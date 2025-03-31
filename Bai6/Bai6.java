package ss23.Bai6;

public class Bai6 {
    public static void main(String[] args) {
        ThreadPriority thread1 = new ThreadPriority("Thread 1 - MIN_PRIORITY");
        thread1.setPriority(Thread.MIN_PRIORITY);

        ThreadPriority thread2 = new ThreadPriority("Thread 2 - NORM_PRIORITY");
        thread2.setPriority(Thread.NORM_PRIORITY);

        ThreadPriority thread3 = new ThreadPriority("Thread 3 - MAX_PRIORITY");
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
