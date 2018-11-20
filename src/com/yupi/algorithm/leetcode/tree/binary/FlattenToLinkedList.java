package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树转链表
 * <p>
 * 思路：递归，需要记录左子树最右的值，注意左右子树都要递归
 */

public class FlattenToLinkedList {

    TreeNode last;

    public void flatten(TreeNode root) {
        flattenSub(root);
    }

    TreeNode flattenSub(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.right;
        if (root.left == null) {
            flattenSub(root.right);
            return root;
        }
        root.right = flattenSub(root.left);
        TreeNode last = root.left;
        while (last.right != null) {
            last = last.right;
        }
        last.right = temp;
        root.left = null;
        flattenSub(last);
        return root;
    }
}