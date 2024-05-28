package com.liyibo1110.template.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-28 17:12
 */
@Slf4j
public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        LOGGER.info("Approach the {} with tears running and hug him!", target);
    }

    @Override
    protected void stealTheItem(String target) {
        LOGGER.info("While in close contact grab the {}'s wallet.", target);
    }
}
