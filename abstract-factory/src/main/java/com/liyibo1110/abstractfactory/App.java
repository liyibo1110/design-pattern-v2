package com.liyibo1110.abstractfactory;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-27 17:59
 */
@Slf4j
@Getter
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("elf kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("orc kingdom");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }

    public void createKingdom(final Kingdom.FactoryMaker.KingdomType type) {
        KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(type);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}
