package com.liyibo1110.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-28 17:08
 */
@Slf4j
public abstract class StealingMethod {

    protected abstract String pickTarget();
    protected abstract void confuseTarget(String target);
    protected abstract void stealTheItem(String target);

    public final void steal() {
        var target = pickTarget();
        LOGGER.info("The target has been closen as {}.", target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
