package com.yupi.algorithm.leetcode.tree.nx;

/**
 * 功能描述：N叉树的最大深度（自底向上）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxDepthBottomToTop {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) {
            max = Math.max(maxDepth(child), max);
        }
        return max + 1;
    }


}