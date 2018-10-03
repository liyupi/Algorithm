package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：不同路径
 *
 * 思路：走楼梯的二维版而已，简单dp，注意初始值
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class UniquePath {

    public int uniquePaths(int n, int m) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int j = 1; j <= n; j++) {
            dp[1][j] = 1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }

}