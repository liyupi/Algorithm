package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树的第二小节点
 */

public class FindSecondMinimumValue {

    private int min = Integer.MAX_VALUE;
    private int nextMin = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.val < min) {
            nextMin = min;
            min = root.val;
        } else if (root.val != min && root.val < nextMin) {
            nextMin = root.val;
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return nextMin == Integer.MAX_VALUE? -1 : nextMin;
    }

}