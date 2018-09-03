package com.yupi.algorithm.leetcode.tree.binary;

/**
 * 功能描述：已知中序后序求先序
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class GetPreOrderByMiddleAndPost {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findPosition(int[] array, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length) {
            return null;
        }
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int pos = findPosition(inorder, inStart, inEnd, postorder[postEnd - 1]);
        TreeNode treeNode = new TreeNode(inorder[pos]);
        treeNode.left = buildTree(inorder, inStart, pos, postorder, postStart, postStart + (pos - inStart));
        treeNode.right = buildTree(inorder, pos + 1, inEnd, postorder, postStart + (pos - inStart), postEnd - 1);
        return treeNode;
    }

    public static void main(String args[]) {

    }
}