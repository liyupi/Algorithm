package com.yupi.algorithm.leetcode.tree.binary;

/**
 * 功能描述：根据前序和中序遍历构造二叉树
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class GetPostOrderByPreAndMiddle {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int getPos(int[] array, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart >= preEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        int pos = getPos(inorder, preorder[preStart], inStart, inEnd);
        treeNode.left = buildTree(preorder, preStart + 1, preStart + 1 + pos - inStart, inorder, inStart, pos);
        treeNode.right = buildTree(preorder, preStart + 1 + pos - inStart, preEnd, inorder, pos + 1, inEnd);
        return treeNode;
    }

    public static void main(String args[]) {
        new GetPostOrderByPreAndMiddle().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }
}