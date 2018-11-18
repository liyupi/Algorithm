package com.yupi.algorithm.leetcode.tree.bst;

/**
 * 功能描述：不同的二叉搜索树
 * <p>
 * 思路：找规律后，递归+dp
 */

public class NumTrees {

    int[] dp;

    public int numTrees(int n) {
        if (n == 0) {
            return 0;
        }
        dp = new int[n + 1];
        dp[0] = 1;
        getSubNum(n);
        return dp[n];
    }

    private void getSubNum(int n) {
        for (int i = 1; i <= n; i++) {
            if (dp[i - 1] == 0) {
                getSubNum(i - 1);
            }
            if (dp[n - i] == 0) {
                getSubNum(n - i);
            }
            dp[n] += dp[i - 1] * dp[n - i];
        }
    }

}