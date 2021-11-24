package lesson_3;

public class Message {

    boolean flag = true;

    synchronized void ping() {
        while (!flag) {
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        flag = false;
        notifyAll();
    }

    synchronized void pong() {
        while (flag) {
            try {
                Thread.sleep(3000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        flag = true;
        notifyAll();
    }
}