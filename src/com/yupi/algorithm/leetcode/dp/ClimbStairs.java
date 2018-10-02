package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：爬楼梯
 *
 * 最优解子结构：/
 * 状态转移方程：dp[i] = dp[i - 1] + dp[i - 2]
 * 边界：n == 1, n == 2
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ClimbStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}