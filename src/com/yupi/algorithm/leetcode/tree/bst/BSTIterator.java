package com.yupi.algorithm.leetcode.tree.bst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 功能描述：二叉树迭代器
 *
 * @author Yupi Li
 * @date 2018/9/23 20:09
 */
public class BSTIterator {

    private TreeNode root;

    private List<Integer> list = new ArrayList<>();

    private Iterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        middleOrder(root);
        iterator = list.listIterator();
    }

    public void middleOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        middleOrder(root.left);
        list.add(root.val);
        middleOrder(root.right);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return iterator.hasNext();
    }

    /** @return the next smallest number */
    public int next() {
        return iterator.next();
    }
}
