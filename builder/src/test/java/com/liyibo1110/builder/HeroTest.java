package com.liyibo1110.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author liyibo
 * @date 2024-05-27 16:24
 */
public class HeroTest {

    @Test
    void testMissingProfession() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(null, "nameless"));
    }

    @Test
    void testMissingName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Hero.Builder(Profession.MAGE, null));
    }

    @Test
    void testBuildHero() {
        String heroName = "bighead";
        var hero = new Hero.Builder(Profession.WARRIOR, heroName)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .withHairType(HairType.LONG_CURLY)
                .withHairColor(HairColor.BLOND)
                .build();

        Assertions.assertNotNull(hero);
        Assertions.assertNotNull(hero.toString());
        Assertions.assertEquals(Profession.WARRIOR, hero.profession());
        Assertions.assertEquals(heroName, hero.name());
        Assertions.assertEquals(Armor.CHAIN_MAIL, hero.armor());
        Assertions.assertEquals(Weapon.SWORD, hero.weapon());
        Assertions.assertEquals(HairType.LONG_CURLY, hero.hairType());
        Assertions.assertEquals(HairColor.BLOND, hero.hairColor());
    }
}
