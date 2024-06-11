package com.liyibo1110.poison.pill;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author liyibo
 * @date 2024-06-11 14:28
 */
public class SimpleMessageQueue implements MessageQueue {

    private final BlockingQueue<Message> queue;

    public SimpleMessageQueue(int bound) {
        queue = new ArrayBlockingQueue(bound);
    }

    @Override
    public void put(Message msg) throws InterruptedException {
        queue.put(msg);
    }

    @Override
    public Message take() throws InterruptedException {
        return queue.take();
    }
}
