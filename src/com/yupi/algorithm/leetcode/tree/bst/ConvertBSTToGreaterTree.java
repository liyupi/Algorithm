package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：二叉搜索树转为累加树
 *
 * 右根左遍历二叉搜索树可得倒序数列，依次加上前一项和即可
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class ConvertBSTToGreaterTree {

    private int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += num;
        num = root.val;
        convertBST(root.left);
        return root;
    }


}