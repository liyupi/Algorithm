package com.yupi.algorithm.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能描述：二叉树是否对称（递归和迭代）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class IsSymmetric {
    public static void main(String args[]) {
        StringBuilder stringBuilder = new StringBuilder("AAB");
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
    }

    /**
     * 递归
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    /**
     * 递归
     */
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    /**
     * 迭代
     */
    public boolean isSymmetricIterate(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null || root.left.val!=root.right.val) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        int preSize = 2;
        while (!queue.isEmpty()) {
            int size = 0;
            if (preSize % 2 != 0) {
                return false;
            }
            for (int i = 0; i < preSize / 2; i++) {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if (left.left != null || right.right != null) {
                    if (left.left == null || right.right == null || left.left.val != right.right.val) {
                        return false;
                    } else {
                        queue.offer(left.left);
                        queue.offer(right.right);
                        size += 2;
                    }
                }
                if (left.right == null && right.left == null) {
                    continue;
                }
                if (left.right == null || right.left == null || left.right.val != right.left.val) {
                    return false;
                }
                queue.offer(left.right);
                queue.offer(right.left);
                size += 2;
            }
            preSize = size;
        }
        return true;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}