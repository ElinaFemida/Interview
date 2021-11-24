package lesson_3;

public class Ping implements Runnable {
    Message msg;
    final int count;

    public Ping(Message ping, int count) {
        this.msg = ping;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            msg.ping();
        }
    }
}
