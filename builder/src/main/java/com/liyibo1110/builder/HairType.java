package com.liyibo1110.builder;

import lombok.AllArgsConstructor;

/**
 * @author liyibo
 * @date 2024-05-27 16:11
 */
@AllArgsConstructor
public enum HairType {

    BALD("bald"),
    SHORT("short"),
    CURLY("curly"),
    LONG_STRAIGHT("long straight"),
    LONG_CURLY("long curly");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
