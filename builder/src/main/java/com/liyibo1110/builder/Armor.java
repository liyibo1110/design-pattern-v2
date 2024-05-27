package com.liyibo1110.builder;

import lombok.AllArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-27 16:09
 */
@AllArgsConstructor
public enum Armor {

    CLOTHES("clothes"),
    LEATHER("leather"),
    CHAIN_MAIL("chain mail"),
    PLATE_MAIL("plate mail");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}

