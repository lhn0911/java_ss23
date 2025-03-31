package ss23.Bai5;

public class Writer extends Thread{
    private final SharedData data;

    public Writer(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "How are you?", "Goodbye"};
        for (String msg : messages) {
            data.write(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
