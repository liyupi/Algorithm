package com.yupi.algorithm.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能描述：每层节点向右连接（迭代和递归）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class LevelRightNext {

    public static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    /**
     * 迭代
     */
    public static void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.offer(root);
        int n = 1;
        while (!queue.isEmpty()) {
            TreeLinkNode pre = queue.poll();
            if (pre.left != null && pre.right != null) {
                queue.offer(pre.left);
                queue.offer(pre.right);
            }
            for (int i = 1; i < n; i++) {
                TreeLinkNode node = queue.poll();
                pre.next = node;
                pre = node;
                if (node.left != null && node.right != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            pre.next = null;
            n *= 2;
        }
    }

    /**
     * 递归
     */
    public static void connectRecursion(TreeLinkNode root) {
        if (root == null){
            return;
        }
        if (root.left!=null&&root.right!=null){
            root.left.next = root.right;
        } else {
            return;
        }
        if (root.next != null){
            root.right.next = root.next.left;
        }
        connectRecursion(root.left);
        connectRecursion(root.right);
    }

    public static void main(String args[]) {
        TreeLinkNode root = new TreeLinkNode(1);
        TreeLinkNode left = new TreeLinkNode(2);
        TreeLinkNode right = new TreeLinkNode(3);
        root.left = left;
        root.right = right;
        connect(root);
    }
}