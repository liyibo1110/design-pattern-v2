package com.liyibo1110.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-28 18:41
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        var factory = new HeroFactoryImpl(
                new ElfBeast("protecting"),
                new ElfMage("cooking"),
                new ElfWarlord("cleaning")
        );
        var beast = factory.createBeast();
        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        LOGGER.info(beast.toString());
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());

        factory = new HeroFactoryImpl(
                new OrcBeast("axe"),
                new OrcMage("sword"),
                new OrcWarlord("laser")
        );
        beast = factory.createBeast();
        mage = factory.createMage();
        warlord = factory.createWarlord();
        LOGGER.info(beast.toString());
        LOGGER.info(mage.toString());
        LOGGER.info(warlord.toString());
    }
}
