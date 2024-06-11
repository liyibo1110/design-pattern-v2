package com.liyibo1110.poison.pill;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-06-11 15:06
 */
@Slf4j
public class Consumer {

    private final MqSubscribePoint queue;

    private final String name;

    public Consumer(String name, MqSubscribePoint queue) {
        this.name = name;
        this.queue = queue;
    }

    public void consume() {
        while(true) {
            try {
                var msg = queue.take();
                if(Message.POISON_PILL.equals(msg)) {
                    LOGGER.info("Consumer {} receive request to terminate.", name);
                    break;
                }
                var sender = msg.getHeader(Message.Headers.SENDER);
                var body = msg.getBody();
                LOGGER.info("Message [{}] from [{}] received by [{}]", body, sender, name);
            } catch (InterruptedException e) {
                LOGGER.error("Exception caught.", e);
                return;
            }
        }
    }
}
