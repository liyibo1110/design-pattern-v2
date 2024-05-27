package com.liyibo1110.factory.method;

import java.util.WeakHashMap;

/**
 * @author liyibo
 * @date 2024-05-27 17:03
 */
public interface Blacksmith {

    Weapon manufactureWeapon(WeaponType weaponType);
}
