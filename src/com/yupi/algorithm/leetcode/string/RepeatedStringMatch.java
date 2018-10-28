package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：最大面积
 *
 * 思路：dfs即可
 *
 */

public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int n = lenB / lenA + 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(A);
            if (sb.indexOf(B) != -1) {
                return i + 1;
            }
        }
        return -1;
    }

}