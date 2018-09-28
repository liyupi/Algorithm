package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：判断一个数是否是2的幂
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        // 判断1的个数，如果只有1个1，必定在最高位
        return n > 0 && (n & (n - 1)) == 0;
    }
}