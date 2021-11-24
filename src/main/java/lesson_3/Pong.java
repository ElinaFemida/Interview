package lesson_3;

public class Pong implements Runnable{
    Message msg;
    final int count;

    public Pong(Message pong, int count) {
        this.msg = pong;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            msg.pong();
        }
    }
}