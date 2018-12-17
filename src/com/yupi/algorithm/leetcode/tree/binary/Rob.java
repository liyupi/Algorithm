package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：打家劫舍III
 * 思路：原本直接递归，发现会重复计算，效率低。可用数组保存计算结果，res数组含义见代码注释
 */

public class Rob {

    public int rob(TreeNode root) {
        int[] res = robSub(root);
        return Math.max(res[0], res[1]);
    }

    // res[0]抢根节点的最大值，res[1]不抢根节点的最大值
    private int[] robSub(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        int[] res = new int[2];
        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }

}