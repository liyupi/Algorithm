package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树中的最大路径和
 * <p>
 * 思路：最大路径一定经过某个根节点，因此遍历根节点
 * 定义一个函数返回某根节点的子节点最大路径
 * 同时注意更新最大值为根节点+其左子节点的一条最大和路径+右子节点的一条最大和路径
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxPathSum {
    
    // 记录最大值
    private int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findOnePath(root);
        return res;
    }

    private int findOnePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findOnePath(root.left);
        int right = findOnePath(root.right);
        // 更新最大值
        res = Math.max(res, Math.max(0, left) + Math.max(0, right) + root.val);
        // 返回一条边（不能返回两条边的和，因为只有一条路）
        return Math.max(0, Math.max(left, right)) + root.val;
    }

}