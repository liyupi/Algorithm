package com.yupi.algorithm.leetcode.string;

/**
 * 功能描述：Z字形变换
 */

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int len = s.length();
        int count = 2 * numRows - 2;
        for (int i = 0; i < len; i++) {
            int left = i % count;
            if (left > numRows - 1) {
                left = count - left;
            }
            sbs[left].append(s.charAt(i));
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : sbs) {
            res.append(sb);
        }
        return res.toString();
    }

}