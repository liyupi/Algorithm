package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：求根到叶子节点数字之和
 *
 * 思路：自顶向下遍历树即可
 */

public class SumNumbers {

    private int res = 0;

    public int sumNumbers(TreeNode root) {
        middleOrder(root, 0);
        return res;
    }

    void middleOrder(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) {
            res += sum;
        } else {
            middleOrder(root.left, sum);
            middleOrder(root.right, sum);
        }
    }
}