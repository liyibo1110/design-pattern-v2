package com.liyibo1110.prototype;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-29 10:41
 */
@Slf4j
public abstract class Prototype<T> implements Cloneable {

    @SneakyThrows
    public T copy() {
        return (T)super.clone();
    }
}
