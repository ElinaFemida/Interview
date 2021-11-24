package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a count for PingPong message");
        int pingPongMessageCount = console.nextInt();
        Message msg = new Message();
        Thread ping = new Thread(new Ping(msg, pingPongMessageCount));
        Thread pong = new Thread(new Pong(msg, pingPongMessageCount));
        try {
            ping.start();
            pong.start();
            ping.join();
            pong.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Counter counter = new Counter(10);
        counter.run();
    }
}


