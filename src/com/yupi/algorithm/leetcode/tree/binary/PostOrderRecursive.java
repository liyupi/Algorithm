package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：二叉树的后序遍历（递归法）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class PostOrderRecursive
{
    public class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x)
        {
            val = x;
        }
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }


    public static void main(String args[])
    {

    }
}