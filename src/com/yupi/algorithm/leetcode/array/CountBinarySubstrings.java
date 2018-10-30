package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：计数二进制子串
 *
 * 思路：遍历，每次结果增加出现连续1的数目和前面连续0数目的最小值
 */

public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        int[] num = new int[2];
        int len = s.length();
        int res = 0;
        int val = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                if (num[1] > 0) {
                    num[0] = 0;
                    val = num[1];
                    num[1] = 0;
                }
                num[0]++;
                if (num[0] <= val) {
                    res++;
                }
            }
            if (c == '1') {
                if (num[0] > 0) {
                    num[1] = 0;
                    val = num[0];
                    num[0] = 0;
                }
                num[1]++;
                if (num[1] <= val) {
                    res++;
                }
            }
        }
        return res;
    }
}