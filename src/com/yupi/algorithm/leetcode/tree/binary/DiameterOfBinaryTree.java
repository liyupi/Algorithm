package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树的直径
 *
 * 思路：类似最大二叉树的路径和，依次以某个点为根节点遍历经过其的路径
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class DiameterOfBinaryTree {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        getLength(root);
        return max;
    }

    public int getLength(TreeNode root) {
        int left = 0;
        if(root.left != null) {
            left = getLength(root.left);
        }
        int right = 0;
        if (root.right != null) {
            right = getLength(root.right);
        }
        max = Math.max(left + right, max);
        return Math.max(left,right) + 1;
    }

}