package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：丑数II
 * 思路：利用丑数的特性，动态规划，每个丑数必定为之前的丑数乘2、3或5得到，并取最小值
 * 使用三个下表记录上一次包含该质数的丑数
 */

public class NthUglyNumber {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[index2] * 2;
            int n3 = dp[index3] * 3;
            int n5 = dp[index5] * 5;
            dp[i] = Math.min(n2, Math.min(n3, n5));
            if (n2 == dp[i]) {
                index2++;
            }
            if (n3 == dp[i]) {
                index3++;
            }
            if (n5 == dp[i]) {
                index5++;
            }
        }
        return dp[n - 1];
    }
}