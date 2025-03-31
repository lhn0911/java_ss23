package ss23.Bai5;

public class Bai5 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Writer writer = new Writer(sharedData);
        Reader reader = new Reader(sharedData);

        writer.start();
        reader.start();
    }
}
