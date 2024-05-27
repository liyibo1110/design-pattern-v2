package com.liyibo1110.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-27 16:22
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        var mage = new Hero.Builder(Profession.MAGE, "freeman")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        LOGGER.info(mage.toString());

        var warrior = new Hero.Builder(Profession.WARRIOR, "bighead")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
                .build();
        LOGGER.info(warrior.toString());

        var thief = new Hero.Builder(Profession.THIEF, "snake")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        LOGGER.info(thief.toString());
    }
}
