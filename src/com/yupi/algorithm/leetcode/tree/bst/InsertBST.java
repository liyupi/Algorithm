package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉树插入
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class InsertBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        new InsertBST().insertIntoBST(root,5);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

}