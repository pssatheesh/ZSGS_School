package Practice.dataStructure;


import java.util.*;

class Producer extends Thread {
    private final Queue<Integer> buffer;
    private final int maxSize;

    public Producer(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxSize; i++) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                buffer.offer(i);
                System.out.println("Produced: " + i);
                buffer.notify();
            }
        }
    }
}

class Consumer extends Thread {
    private final Queue<Integer> buffer;

    public Consumer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int data = buffer.poll();
                System.out.println("Consumed: " + data);
                buffer.notify();
            }
        }
    }
}

public class demo2 {
    public static void main(String[] args) {
        Queue<Integer> buffer = new PriorityQueue<>();
        int maxSize = 5;

        Producer producer = new Producer(buffer, maxSize);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

    }
}

