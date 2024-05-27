package com.liyibo1110.factory.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryMethodTest {

    @Test
    void testOrcBlacksmithWithSpear() {
        var blacksmith = new OrcBlacksmith();
        var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, OrcWeapon.class);
    }

    @Test
    void testOrcBlacksmithWithAxe() {
        var blacksmith = new OrcBlacksmith();
        var weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        verifyWeapon(weapon, WeaponType.AXE, OrcWeapon.class);
    }

    @Test
    void testElfBlacksmithWithShortSword() {
        var blacksmith = new ElfBlacksmith();
        var weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        verifyWeapon(weapon, WeaponType.SHORT_SWORD, ElfWeapon.class);
    }

    @Test
    void testElfBlacksmithWithSpear() {
        var blacksmith = new ElfBlacksmith();
        var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, ElfWeapon.class);
    }

    private void verifyWeapon(Weapon weapon, WeaponType expectedWeaponType, Class<?> clazz) {
        assertTrue(clazz.isInstance(weapon), "Weapon must be an object of: " + clazz.getName());
        assertEquals(expectedWeaponType, weapon.weaponType(), "Weapon must be of weaponType: " + expectedWeaponType);
    }
}
