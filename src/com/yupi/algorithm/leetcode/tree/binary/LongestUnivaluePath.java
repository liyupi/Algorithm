package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：最长同值路径值
 *
 * 思路：由于只有一条路径，则应最长路径为以某个节点为根结点的路径值
 * 使用max记录最长路径
 * 每个节点的最长路径值为左子树最长路径（连接）/0（不连接） + 右子树最长路径（连接）/0（不连接）
 * 需要新建一个函数，返回左子树/右子树最长路径中较大的一个（而不是返回两边）
 */

public class LongestUnivaluePath {

    private int max = Integer.MIN_VALUE;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getLongestUnivaluePath(root);
        return max;
    }

    private int getLongestUnivaluePath(TreeNode root) {
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = getLongestUnivaluePath(root.left);
            if (root.left.val == root.val) {
                left++;
            } else {
                left = 0;
            }
        }
        if (root.right != null) {
            right = getLongestUnivaluePath(root.right);
            if (root.right.val == root.val) {
                right++;
            } else {
                right = 0;
            }
        }
        int maxNum = left >= right ? left : right;
        max = Math.max(left + right, max);
        return maxNum;
    }

}