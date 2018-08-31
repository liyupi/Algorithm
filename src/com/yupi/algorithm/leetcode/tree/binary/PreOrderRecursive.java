package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述：二叉树的先序遍历（迭代法）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class PreOrderRecursive
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

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }


    public static void main(String args[])
    {

    }
}