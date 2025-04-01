package ss23.Bai5;

public class Writer extends Thread{
    private final SharedData data;

    public Writer(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        String[] messages = {"tin nhawns 1", "tin nhắn 2", "tin nhắn 3"};
        for (String m : messages) {
            data.write(m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
