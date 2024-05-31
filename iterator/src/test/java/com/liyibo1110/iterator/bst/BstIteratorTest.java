package com.liyibo1110.iterator.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.NoSuchElementException;

/**
 * @author liyibo
 * @date 2024-05-31 16:50
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BstIteratorTest {

    private TreeNode<Integer> nonEmptyRoot;
    private TreeNode<Integer> emptyRoot;

    @BeforeAll
    void createTrees() {
        nonEmptyRoot = new TreeNode<>(5);
        nonEmptyRoot.insert(3);
        nonEmptyRoot.insert(7);
        nonEmptyRoot.insert(1);
        nonEmptyRoot.insert(4);
        nonEmptyRoot.insert(6);

        emptyRoot = null;
    }

    @Test
    void nextForEmptyTree() {
        var iter = new BstIterator(emptyRoot);
        Assertions.assertThrows(NoSuchElementException.class, iter::next,
                "next() should throw an IllegalStateException if hasNext() is false.");
    }

    @Test
    void nextOverEntirePopulatedTree() {
        var iter = new BstIterator(nonEmptyRoot);
        Assertions.assertEquals(Integer.valueOf(1), iter.next().getVal(), "First Node is 1.");
        Assertions.assertEquals(Integer.valueOf(3), iter.next().getVal(), "Second Node is 3.");
        Assertions.assertEquals(Integer.valueOf(4), iter.next().getVal(), "Third Node is 4.");
        Assertions.assertEquals(Integer.valueOf(5), iter.next().getVal(), "Fourth Node is 5.");
        Assertions.assertEquals(Integer.valueOf(6), iter.next().getVal(), "Fifth Node is 6.");
        Assertions.assertEquals(Integer.valueOf(7), iter.next().getVal(), "Sixth Node is 7.");
    }

    @Test
    void hasNextForEmptyTree() {
        var iter = new BstIterator(emptyRoot);
        Assertions.assertFalse(iter.hasNext(), "hasNext() should return false for empty tree.");
    }

    @Test
    void hasNextForPopulatedTree() {
        var iter = new BstIterator(nonEmptyRoot);
        Assertions.assertTrue(iter.hasNext(), "hasNext() should return true for populated tree.");
    }

    @Test
    void nextAndHasNextOverEntirePopulatedTree() {
        var iter = new BstIterator(nonEmptyRoot);
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(1), iter.next().getVal(), "First Node is 1.");
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(3), iter.next().getVal(), "Second Node is 3.");
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(4), iter.next().getVal(), "Third Node is 4.");
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(5), iter.next().getVal(), "Fourth Node is 5.");
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(6), iter.next().getVal(), "Fifth Node is 6.");
        Assertions.assertTrue(iter.hasNext(), "Iterator hasNext() should be true.");
        Assertions.assertEquals(Integer.valueOf(7), iter.next().getVal(), "Sixth Node is 7.");
        Assertions.assertFalse(iter.hasNext(), "Iterator hasNext() should be false, end of tree.");
    }
}
