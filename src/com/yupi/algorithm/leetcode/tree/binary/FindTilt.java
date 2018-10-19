package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：二叉树的坡度
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindTilt {

    int sum = 0;

    public int findTilt(TreeNode root) {
        getSum(root);
        return sum;
    }

    public int getSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getSum(root.left);
        int right = getSum(root.right);
        sum += Math.abs(left - right);
        return left + right + root.val;
    }

}