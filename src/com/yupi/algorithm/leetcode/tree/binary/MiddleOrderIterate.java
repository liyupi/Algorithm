package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述：二叉树的中序遍历（迭代法）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class MiddleOrderIterate
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }


    public static void main(String args[])
    {

    }
}