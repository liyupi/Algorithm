package com.yupi.algorithm.leetcode.dp;

/**
 * 功能描述：解码方式
 * <p>
 * 思路：dfs，dp[i]表示i位码的表示方式数
 */

public class NumDecodings {

    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            dp[i] = (s.charAt(i - 1) == '0') ? 0 : dp[i - 1];
            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[len];
    }


}