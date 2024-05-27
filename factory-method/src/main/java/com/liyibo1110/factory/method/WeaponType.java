package com.liyibo1110.factory.method;

import lombok.RequiredArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-27 17:02
 */
@RequiredArgsConstructor
public enum WeaponType {

    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
