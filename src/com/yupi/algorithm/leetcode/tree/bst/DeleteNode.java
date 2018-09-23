package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉树删除节点
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            // 将右子树最小的节点设置为删除节点的值，并在右子树中移除最小节点
            if (root.left != null && root.right != null) {
                root.val = findMin(root.right).val;
                root.right = deleteNode(root.right, root.val);
            } else {
                root = root.left != null ? root.left : root.right;
            }
            return root;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

}