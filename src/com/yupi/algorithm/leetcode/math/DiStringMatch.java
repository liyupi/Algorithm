package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：增减字符串匹配
 * <p>
 * 思路：水题
 */

public class DiStringMatch {

    public int[] diStringMatch(String S) {
        int len = S.length();
        int left = 0;
        int right = len;
        int[] res = new int[len + 1];
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                res[i] = left++;
            } else {
                res[i] = right--;
            }
        }
        res[len] = left;
        return res;
    }
}