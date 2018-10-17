package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉搜索树的最小绝对差
 *
 * 思路：利用二叉搜索树中序遍历为顺序遍历，最小绝对差一定是相邻两个元素的差
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class GetMinimumDifference {

    private int min = Integer.MAX_VALUE;
    private int val = -1;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return -1;
        }
        getMinimumDifference(root.left);
        if (val != -1) {
            min = Math.min(Math.abs(root.val - val),min);
        }
        val = root.val;
        getMinimumDifference(root.right);
        return min;
    }

}