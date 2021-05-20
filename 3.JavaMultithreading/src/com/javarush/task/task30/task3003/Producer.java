package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {

    private TransferQueue<ShareItem> queue;
    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            String str = String.format("ShareItem-%d", i);
            System.out.format("Элемент 'ShareItem-%d' добавлен\n", i);
            queue.offer(new ShareItem(str, i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            if (queue.hasWaitingConsumer()) {
                System.out.format("Consumer в ожидании!\n");
            }
        }
    }
}
