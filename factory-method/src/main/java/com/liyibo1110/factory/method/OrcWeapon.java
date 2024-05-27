package com.liyibo1110.factory.method;

/**
 * @author liyibo
 * @date 2024-05-27 17:03
 */
public record OrcWeapon(WeaponType weaponType) implements Weapon {

    @Override
    public String toString() {
        return "an orcish " + weaponType;
    }
}
