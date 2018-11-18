package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.*;

/**
 * 功能描述：二叉树锯齿形层次遍历
 * <p>
 * 思路：判断奇偶层，进行反转或addFirst即可
 */

public class ZigZagLevelOrder {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 1;
        int next = 0;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.right != null) {
                    queue.offer(node.right);
                    next++;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                    next++;
                }
            }
            size = next;
            next = 0;
            if ((res.size() &1) == 1) {
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}