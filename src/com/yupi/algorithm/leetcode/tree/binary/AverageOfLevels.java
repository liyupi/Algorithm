package com.yupi.algorithm.leetcode.tree.binary;

import com.yupi.algorithm.leetcode.tree.bst.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：二叉树的层平均值
 * 
 */

public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int size = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int temp = 0;
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    temp++;
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    temp++;
                    queue.offer(node.right);
                }
            }
            list.add((double) sum / size);
            size = temp;
        }
        return list;
    }
}