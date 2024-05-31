package com.liyibo1110.iterator.bst;

import lombok.Getter;
import lombok.Setter;

/**
 * @author liyibo
 * @date 2024-05-31 16:03
 */
public class TreeNode<T extends Comparable<T>> {

    private final T val;

    @Getter
    @Setter
    private TreeNode<T> left;

    @Getter
    @Setter
    private TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public T getVal() {
        return val;
    }

    public void insert(T valToInsert) {
        var parent = getParentNodeOfValueToBeInserted(valToInsert);
        parent.insertNewChild(valToInsert);
    }

    private TreeNode<T> getParentNodeOfValueToBeInserted(T valToInsert) {
        TreeNode<T> parent = null;
        var cur = this;
        while(cur != null) {
            parent = cur;
            cur = cur.traverseOneLevelDown(valToInsert);
        }
        return parent;
    }

    private TreeNode<T> traverseOneLevelDown(T value) {
        if(this.isGreaterThan(value)) {
            return this.left;
        }
        return this.right;
    }

    private void insertNewChild(T valToInsert) {
        if(this.isLessThanOrEqualTo(valToInsert)) {
            this.setRight(new TreeNode(valToInsert));
        }else {
            this.setLeft(new TreeNode(valToInsert));
        }
    }

    private boolean isGreaterThan(T val) {
        return this.val.compareTo(val) > 0;
    }

    private boolean isLessThanOrEqualTo(T val) {
        return this.val.compareTo(val) < 1;
    }

    public String toString() {
        return val.toString();
    }
}
