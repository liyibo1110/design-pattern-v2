package com.liyibo1110.iterator.list;

import com.liyibo1110.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyibo
 * @date 2024-05-31 16:30
 */
public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {
        items = List.of(
            new Item(ItemType.POTION, "Potion of courage"),
            new Item(ItemType.RING, "Ring of shadows"),
            new Item(ItemType.POTION, "Potion of wisdom"),
            new Item(ItemType.POTION, "Potion of blood"),
            new Item(ItemType.WEAPON, "Sword of silver +1"),
            new Item(ItemType.POTION, "Potion of rust"),
            new Item(ItemType.POTION, "Potion of healing"),
            new Item(ItemType.RING, "Ring of armor"),
            new Item(ItemType.WEAPON, "Steel halberd"),
            new Item(ItemType.WEAPON, "Dagger of poison"));
    }

    public Iterator<Item> iterator(ItemType type) {
        return new TreasureChestItemIterator(this, type);
    }

    public List<Item> getItems() {
        return new ArrayList(items);
    }
}
