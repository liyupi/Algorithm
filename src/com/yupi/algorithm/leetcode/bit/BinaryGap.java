package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：二进制最大间距
 * <p>
 * 思路：算术右移，依次判断每一位是否为1，双指针记录间距
 */

public class BinaryGap {

    public int binaryGap(int N) {
        int left = -1;
        int right = -1;
        int max = 0;
        while (N != 0) {
            left++;
            if ((N & 1) == 1) {
                if(right != -1) {
                    max = Math.max(left - right, max);
                }
                right = left;
            }
            N >>>= 1;
        }
        return max;
    }
}