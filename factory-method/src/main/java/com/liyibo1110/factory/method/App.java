package com.liyibo1110.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-27 17:09
 */
@Slf4j
public class App {

    private static final String MANUFACTURED = "{} manufactured {}";

    public static void main(String[] args) {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
    }
}
