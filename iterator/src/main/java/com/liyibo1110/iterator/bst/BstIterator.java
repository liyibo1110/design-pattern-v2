package com.liyibo1110.iterator.bst;

import com.liyibo1110.iterator.Iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 * @author liyibo
 * @date 2024-05-31 16:22
 */
public class BstIterator<T extends Comparable<T>> implements Iterator<TreeNode<T>> {

    private final ArrayDeque<TreeNode<T>> pathStack;

    public BstIterator(TreeNode<T> root) {
        pathStack = new ArrayDeque();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode<T> node) {
        while(node != null) {
            pathStack.push(node);
            node = node.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next() throws NoSuchElementException {
        if(pathStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        var next = pathStack.pop();
        pushPathToNextSmallest(next.getRight());
        return next;
    }
}
