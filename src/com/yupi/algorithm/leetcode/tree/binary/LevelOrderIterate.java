package com.yupi.algorithm.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：二叉树的层次遍历（BFS）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class LevelOrderIterate
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


    public List<List<Integer>> levelOrder(TreeNode root)
    {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> listList = new LinkedList<>();
        if (root == null)
        {
            return listList;
        }
        queue.offer(root);
        int lastSize = 1;
        int size = 0;
        while (!queue.isEmpty())
        {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < lastSize; i++)
            {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                {
                    queue.offer(node.left);
                    size++;
                }
                if (node.right != null)
                {
                    queue.offer(node.right);
                    size++;
                }
            }
            lastSize = size;
            size = 0;
            listList.add(list);
        }
        return listList;
    }


    public static void main(String args[])
    {

    }
}