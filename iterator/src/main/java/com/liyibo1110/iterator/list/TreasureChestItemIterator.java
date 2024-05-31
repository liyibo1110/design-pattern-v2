package com.liyibo1110.iterator.list;

import com.liyibo1110.iterator.Iterator;

import java.util.List;

/**
 * @author liyibo
 * @date 2024-05-31 16:32
 */
public class TreasureChestItemIterator implements Iterator<Item> {

    private final TreasureChest chest;
    private int index;
    private final ItemType type;

    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        this.type = type;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    @Override
    public Item next() {
        index = findNextIndex();
        if(index != -1) {
            return chest.getItems().get(index);
        }
        return null;
    }

    private int findNextIndex() {
        var items = chest.getItems();
        var tempIndex = index;
        while(true) {
            tempIndex++;
            if(tempIndex >= items.size()) {
                tempIndex = -1;
                break;
            }
            if(type.equals(ItemType.ANY) || items.get(tempIndex).getType().equals(type)) {
                break;
            }
        }
        return tempIndex;
    }
}
