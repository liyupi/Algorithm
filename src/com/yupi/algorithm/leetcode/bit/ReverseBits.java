package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：颠倒二进制位
 *
 * 思路：依次将n的末位设置成m的末位，但m每次左移，n每次右移
 *
 * @author Yupi Li
 * @date 2018/10/04 09:37
 */

public class ReverseBits {


    public int reverseBits(int n) {
        int m = 0;
        for (int i = 0; i < 32; i++) {
            m <<= 1;
            m = m | (n & 1);
            n >>= 1;
        }
        return m;
    }

}