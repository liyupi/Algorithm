package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉树查找
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

}