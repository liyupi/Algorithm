package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述：二叉树的后序遍历（迭代法）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class PostOrderIterate
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


    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty())
        {
            while (root != null)
            {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if (root.right != null && root.right != pre)
            {
                root = root.right;
            } else
            {
                root = stack.pop();
                list.add(root.val);
                pre = root;
                root = null;
            }
        }
        return list;
    }


    public static void main(String args[])
    {

    }
}