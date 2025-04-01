package ss23.Bai5;

public class SharedData {
    private String message;
    private boolean hasMessage = false;

    public synchronized void write(String m) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = m;
        hasMessage = true;
        System.out.println("Writer: Đã gửi tin nhắn - " + m);
        notify();
    }
    public synchronized void read() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Reader: Đã nhận tin nhắn - " + message);
        hasMessage = false;
        notify();
    }
}
