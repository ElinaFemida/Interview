package lesson_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    private final Lock lock;
    private int count = 0;
    private int maxCount;


    public Counter(int maxCount) {
        lock = new ReentrantLock();
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (count < maxCount) {
            increment();
            System.out.println(count);
        }
    }

    void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }
}
