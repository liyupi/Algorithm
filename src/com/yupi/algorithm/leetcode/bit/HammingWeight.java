package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：位1的个数
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class HammingWeight {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n -1);
        }
        return count;
    }
}