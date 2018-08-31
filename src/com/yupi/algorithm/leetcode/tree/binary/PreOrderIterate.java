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
public class PreOrderIterate
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

    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
        {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
            {
                stack.push(node.right);
            }
            if (node.left != null)
            {
                stack.push(node.left);
            }
        }
        return list;
    }


    public static void main(String args[])
    {

    }
}