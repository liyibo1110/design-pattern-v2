package com.liyibo1110.iterator.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liyibo
 * @date 2024-05-31 16:30
 */
@AllArgsConstructor
public class Item {

    @Getter
    @Setter
    private ItemType type;
    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
