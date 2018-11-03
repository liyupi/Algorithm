package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：字符的最短距离
 *
 * 思路：先用一数组记录所有的特殊字符位置，再依次记录每个字符到其的距离的最小值即可
 *
 */

public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int[] cPos = new int[S.length()];
        int pos = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                cPos[pos++] = i;
            }
        }
        int nPos = 0;
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int dis1 = Math.abs(cPos[nPos] - i);
            if (nPos + 1 < pos && cPos[nPos + 1] - i < dis1) {
                nPos++;
                res[i] = cPos[nPos] - i;
            } else {
                res[i] = dis1;
            }
        }
        return res;
    }
}