package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：买卖股票的最佳时期
 * <p>
 * 思路：动态规划
 * 状态转移方程：maxProfit[i] = max(prices[i] - min[i - 1], maxProfit[i - 1])
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i] - min, max);
            min = Math.min(prices[i], min);
        }
        return max;
    }

}