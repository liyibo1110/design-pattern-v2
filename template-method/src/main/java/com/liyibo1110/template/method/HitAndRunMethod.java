package com.liyibo1110.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-28 17:12
 */
@Slf4j
public class HitAndRunMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        LOGGER.info("Approach the {} from behind.", target);
    }

    @Override
    protected void stealTheItem(String target) {
        LOGGER.info("Grab the handbag and run away fast!");
    }
}
