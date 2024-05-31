package com.liyibo1110.iterator.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

/**
 * @author liyibo
 * @date 2024-05-31 16:50
 */
public class TreasureChestTest {

    public static List<Object[]> dataProvider() {
        return List.of(
            new Object[]{new Item(ItemType.POTION, "Potion of courage")},
            new Object[]{new Item(ItemType.RING, "Ring of shadows")},
            new Object[]{new Item(ItemType.POTION, "Potion of wisdom")},
            new Object[]{new Item(ItemType.POTION, "Potion of blood")},
            new Object[]{new Item(ItemType.WEAPON, "Sword of silver +1")},
            new Object[]{new Item(ItemType.POTION, "Potion of rust")},
            new Object[]{new Item(ItemType.POTION, "Potion of healing")},
            new Object[]{new Item(ItemType.RING, "Ring of armor")},
            new Object[]{new Item(ItemType.WEAPON, "Steel halberd")},
            new Object[]{new Item(ItemType.WEAPON, "Dagger of poison")}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testIterator(Item expectedItem) {
        final var chest = new TreasureChest();
        final var iterator = chest.iterator(expectedItem.getType());
        Assertions.assertNotNull(iterator);

        while(iterator.hasNext()) {
            final var item = iterator.next();
            Assertions.assertNotNull(item);
            Assertions.assertEquals(expectedItem.getType(), item.getType());

            final var name = item.toString();
            Assertions.assertNotNull(name);
            if(expectedItem.toString().equals(name)) {
                return;
            }
        }
        Assertions.fail("Expected to find item [" + expectedItem + "] using iterator, but we didn't.");
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testGetItems(Item expectedItem) {
        final var chest = new TreasureChest();
        final var items = chest.getItems();
        Assertions.assertNotNull(items);

        for (final var item : items) {
            Assertions.assertNotNull(item);
            Assertions.assertNotNull(item.getType());
            Assertions.assertNotNull(item.toString());

            final var sameType = expectedItem.getType() == item.getType();
            final var sameName = expectedItem.toString().equals(item.toString());
            if(sameType && sameName) {
                return;
            }
        }

        Assertions.fail("Expected to find item [" + expectedItem + "] in the item list, but we didn't.");
    }
}
