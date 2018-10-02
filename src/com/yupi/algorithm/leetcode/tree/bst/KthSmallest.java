package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉搜索树中第K小的元素
 * <p>
 * 思路：中序遍历，设置一个计数器，遍历到计数器的值为k停止
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class KthSmallest {

    // 计数器
    private int count = 0;

    // 中序遍历
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        int val = kthSmallest(root.left,k);
        // 不是-1，说明结果已找到，继续返回
        if (val != -1) {
            return val;
        }
        if (++count == k) {
            return root.val;
        }
        return kthSmallest(root.right,k);
    }

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        new KthSmallest().kthSmallest(treeNode,1);
    }



}