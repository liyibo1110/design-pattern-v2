package com.liyibo1110.poison.pill;

/**
 * @author liyibo
 * @date 2024-06-11 14:26
 */
public interface MqPublishPoint {

    void put(Message msg) throws InterruptedException;
}
