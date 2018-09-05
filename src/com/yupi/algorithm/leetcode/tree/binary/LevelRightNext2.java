package com.yupi.algorithm.leetcode.tree.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述：每层节点向右连接-非完全二叉树（迭代和递归）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class LevelRightNext2 {

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
            int nextN = 0;
            TreeLinkNode pre = queue.poll();
            if (pre.left != null) {
                queue.offer(pre.left);
                nextN++;
            }
            if (pre.right != null) {
                queue.offer(pre.right);
                nextN++;
            }
            for (int i = 1; i < n; i++) {
                TreeLinkNode node = queue.poll();
                pre.next = node;
                pre = node;
                if (pre.left != null) {
                    queue.offer(pre.left);
                    nextN++;
                }
                if (pre.right != null) {
                    queue.offer(pre.right);
                    nextN++;
                }
            }
            pre.next = null;
            n = nextN;
        }
    }

    /**
     * 递归
     */
    public static void connectRecursion(TreeLinkNode root) {
        if (root == null){
            return;
        }
        List<TreeLinkNode> list = new ArrayList<>();
        list.add(root);
        connectRecursion(list);
    }

    public static void connectRecursion(List<TreeLinkNode> list) {
        int size = list.size();
        list.add(null);
        List<TreeLinkNode> childrenList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeLinkNode node = list.get(i);
            if (node.left!=null){
                childrenList.add(node.left);
            }
            if (node.right!=null){
                childrenList.add(node.right);
            }
            node.next = list.get(i+1);
        }
        if (!childrenList.isEmpty()){
            connectRecursion(childrenList);
        }
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