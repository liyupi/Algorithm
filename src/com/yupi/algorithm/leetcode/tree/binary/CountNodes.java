package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

/**
 * 功能描述：求完全二叉树的节点数
 * 思路：直接遍历所有节点肯定超时，注意使用完全二叉树的性质
 * 总节点数 = 左子树节点数 + 右子树节点数 + 1
 * 若左子树高度 = 右子树高度，说明左子树为满二叉树，左子树节点数 + 1 = 2的子树高度次方，
 * 此时右子树为完全二叉树，递归即可
 * 若左子树高度大于右子树高度，说明左子树为完全二叉树，右子树为满二叉树，递归同上。
 * 求子树高度一直递归左节点即可（完全二叉树节点靠左）
 */

public class CountNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    public int getHeight(TreeNode root) {
        int height = 0;
        while (root != null) {
            root = root.left;
            height++;
        }
        return height;
    }


}