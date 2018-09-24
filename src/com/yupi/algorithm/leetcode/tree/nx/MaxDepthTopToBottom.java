package com.yupi.algorithm.leetcode.tree.nx;

/**
 * 功能描述：N叉树的最大深度（自顶向下）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxDepthTopToBottom {

    private int max = 1;

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        maxDepth(root, 1);
        return max;
    }

    public int maxDepth(Node root, int depth) {
        for (Node child : root.children) {
            int temp = maxDepth(child, depth + 1);
            max = temp > max ? temp : max;
        }
        return depth;
    }

}