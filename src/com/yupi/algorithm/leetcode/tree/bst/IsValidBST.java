package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：是否为二叉搜索树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        // 限定子节点范围
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

}