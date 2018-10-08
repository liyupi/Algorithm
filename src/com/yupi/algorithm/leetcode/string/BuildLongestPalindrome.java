package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：构造最长回文串
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class BuildLongestPalindrome {

    public int longestPalindrome(String s) {
        int[] map = new int[123];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            map[s.charAt(i)]++;
        }
        int res = 0;
        int maxOdd = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] % 2 == 0) {
                res += map[i];
            } else {
                res += map[i] - 1;
                maxOdd = 1;
            }
        }
        return res + maxOdd;
    }

}