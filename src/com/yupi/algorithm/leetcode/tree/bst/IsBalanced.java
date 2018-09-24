package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：是否为平衡二叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        if (left == -1) {
            return -1;
        }
        int right = getHeight(root.right);
        // 左右子树均为平衡二叉树且左右子树高度差小于1
        if (right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}