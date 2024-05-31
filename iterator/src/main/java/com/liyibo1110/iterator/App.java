package com.liyibo1110.iterator;

import com.liyibo1110.iterator.bst.BstIterator;
import com.liyibo1110.iterator.bst.TreeNode;
import com.liyibo1110.iterator.list.ItemType;
import com.liyibo1110.iterator.list.TreasureChest;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liyibo
 * @date 2024-05-31 16:39
 */
@Slf4j
public class App {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType type) {
        LOGGER.info("------------------------");
        LOGGER.info("Item Iterator for ItemType " + type + ": ");
        var itemIterator = TREASURE_CHEST.iterator(type);
        while(itemIterator.hasNext()) {
            LOGGER.info(itemIterator.next().toString());
        }
    }

    private static void demonstrateBstIterator() {
        LOGGER.info("------------------------");
        LOGGER.info("BST Iterator: ");
        var root = buildIntegerBst();
        var bstIterator = new BstIterator(root);
        while(bstIterator.hasNext()) {
            LOGGER.info("Next node: " + bstIterator.next().getVal());
        }
    }

    private static TreeNode<Integer> buildIntegerBst() {
        var root = new TreeNode(8);
        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);
        return root;
    }

    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(ItemType.RING);
        demonstrateTreasureChestIteratorForType(ItemType.POTION);
        demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
        demonstrateTreasureChestIteratorForType(ItemType.ANY);

        demonstrateBstIterator();
    }
}
