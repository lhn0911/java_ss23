package ss23.Bai5;

public class Reader extends Thread{
    private final SharedData data;

    public Reader(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(true){
            data.read();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
