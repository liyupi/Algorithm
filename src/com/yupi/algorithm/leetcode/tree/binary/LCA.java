package com.yupi.algorithm.leetcode.tree.binary;

/**
 * 功能描述：二叉树最近公共祖先
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class LCA {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 寻找节点位置
        if (root == null || root == p || root == q) {
            return root;
        }
        // 没找到则递归查找左右子树
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 左右节点都找到了
        if (left != null && right != null) {
            return root;
        }
        // 有一边没找到，返回找到的值
        return left == null ? right : left;
    }

    public static void main(String args[]) {
    }
}