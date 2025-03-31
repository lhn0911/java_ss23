package ss23.Bai6;

public class ThreadPriority extends Thread{
    private final String message;

    public ThreadPriority(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
