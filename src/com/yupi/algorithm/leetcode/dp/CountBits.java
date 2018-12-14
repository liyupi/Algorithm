package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：比特位计数
 * 思路：显然用dp，dp[i] = dp[i & (i - 1)] + 1; 因为i & (i - 1)屏蔽了最低位的1，所以要+1
 */

public class CountBits {

    /**
     * 解法1
     * @param num
     * @return
     */
/*    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        int max = 0;
        int nextMax = 1;
        for (int i = 1; i <= num; i++) {
            if (i == nextMax) {
                max = nextMax;
                nextMax <<= 1;
            }
            dp[i] = 1 + dp[i - max];
        }
        return dp;
    }*/

    /**
     * 解法2
     *
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            dp[i] = 1 + dp[i & (i - 1)];
        }
        return dp;
    }


}