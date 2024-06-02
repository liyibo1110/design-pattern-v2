package com.liyibo1110.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-31 17:49
 */
@Slf4j
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        LOGGER.info("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        LOGGER.info("The troll shrieks in horror and runs away!");
    }
}
