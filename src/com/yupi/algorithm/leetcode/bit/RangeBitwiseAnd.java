package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：数字范围按位与
 *
 * 思路：因从10xxxx到11xxxx必然经历了110000的状态
 * 所以按位与的结果和范围最大值和最小值从高位起最先不同的位有关。
 * 因此找到该位，可先右移再左移（让右边全变成0）
 */

public class RangeBitwiseAnd {

    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            offset++;
        }
        return m << offset;
    }
}