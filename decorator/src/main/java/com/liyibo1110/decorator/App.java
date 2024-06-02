package com.liyibo1110.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-31 17:51
 */
@Slf4j
public class App {

    public static void main(String[] args) {

        LOGGER.info("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        LOGGER.info("Simple troll power: {}.\n", troll.getAttackPower());

        LOGGER.info("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        LOGGER.info("Clubbed troll power: {}.\n", clubbedTroll.getAttackPower());
    }
}
