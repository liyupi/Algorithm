package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：有序数组转为平衡二叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = buildTree(nums, left, middle - 1);
        root.right = buildTree(nums, middle + 1, right);
        return root;
    }


}