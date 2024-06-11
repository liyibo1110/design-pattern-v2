package com.liyibo1110.poison.pill;

/**
 * @author liyibo
 * @date 2024-06-11 14:27
 */
public interface MqSubscribePoint {

    Message take() throws InterruptedException;
}
