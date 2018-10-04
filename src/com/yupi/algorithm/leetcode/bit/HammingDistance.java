package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：两个二进制数的不同位数
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        while (num != 0) {
            count++;
            num &= num - 1;
        }
        return count;
    }
}