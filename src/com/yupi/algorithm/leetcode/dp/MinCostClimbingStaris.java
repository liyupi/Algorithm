package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：
 * <p>
 * 思路：dp[i]表示走到第位置的最小花费，状态转移方程：dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i]
 * 由于最后一步不花费，结果为dp[last-2]和dp[last-1]中的较小值
 */

public class MinCostClimbingStaris {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length-2], dp[cost.length - 1]);
    }

}
