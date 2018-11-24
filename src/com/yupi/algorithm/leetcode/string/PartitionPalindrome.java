package com.yupi.algorithm.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：分割回文串
 * <p>
 * 思路：先利用求最长回文子串的思路得到dp[i][j]（从i到j是否为回文），然后再dfs递归即可
 */

public class PartitionPalindrome {

    // dp[i][j]表示字符串第i到j位是否为回文串
    boolean[][] dp;

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        int len = s.length();
        if (len == 0) {
            return res;
        }
        dp = new boolean[len][len];
        getPalidrome(s);
        dfs(new ArrayList<>(), 0, s);
        return res;
    }

    private void dfs(List<String> list, int start, String s) {
        int len = s.length();
        if (start == len) {
            res.add(new ArrayList<>(list));
        }
        for (int i = start; i < len; i++) {
            if (dp[start][i]) {
                list.add(s.substring(start, i + 1));
                dfs(list, i + 1, s);
                list.remove(list.size() - 1);
            }
        }
    }

    private void getPalidrome(String s) {
        int len = s.length();
        dp[0][0] = true;
        for (int i = 1; i < len; i++) {
            dp[i][i] = true;
            if (s.charAt(i) == s.charAt(i - 1)) {
                dp[i-1][i] = true;
            }
        }
        for (int i = 2; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (dp[j + 1][j + i - 1] && s.charAt(j) == s.charAt(j + i)) {
                    dp[j][j + i] = true;
                }
            }
        }
    }

}