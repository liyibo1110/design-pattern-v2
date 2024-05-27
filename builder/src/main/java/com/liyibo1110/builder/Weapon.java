package com.liyibo1110.builder;

/**
 * @author liyibo
 * @date 2024-05-27 16:11
 */
public enum Weapon {

    DAGGER,
    SWORD,
    AXE,
    WARHAMMER,
    BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
