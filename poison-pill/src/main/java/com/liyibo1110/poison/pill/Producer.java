package com.liyibo1110.poison.pill;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author liyibo
 * @date 2024-06-11 15:01
 */
@Slf4j
public class Producer {

    private final MqPublishPoint queue;

    private final String name;

    private boolean isStopped;

    public Producer(String name, MqPublishPoint queue) {
        this.name = name;
        this.queue = queue;
        this.isStopped = false;
    }

    public void send(String body) {
        if(isStopped) {
            throw new IllegalStateException(String.format(
                    "Producer %s was stopped and fail to deliver requested message [%s].", body, name));
        }
        var msg = new SimpleMessage();
        msg.addHeader(Message.Headers.DATE, new Date().toString());
        msg.addHeader(Message.Headers.SENDER, name);
        msg.setBody(body);

        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            LOGGER.error("Exception caught.", e);
        }
    }

    public void stop() {
        isStopped = true;
        try {
            queue.put(Message.POISON_PILL);
        } catch (InterruptedException e) {
            LOGGER.error("Exception caught.", e);
        }
    }
}
