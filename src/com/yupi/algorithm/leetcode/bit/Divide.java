package com.yupi.algorithm.leetcode.bit;

/**
 * 功能描述：两数相除（不使用乘除法）
 *
 * 思路：使用位运算，结果为被除数包含多少个除数，每次将除数个数*2来加速
 *
 */

public class Divide {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1 || divisor == 0) {
            return Integer.MAX_VALUE;
        }
        boolean negative = false;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) {
            negative = true;
        }
        int res = 0;
        long left = Math.abs((long)dividend);
        long dvr = Math.abs((long)divisor);
        while (left >= dvr) {
            long temp = dvr;
            int shift = 1;
            while (left >= (temp << 1)) {
                temp <<= 1;
                shift <<= 1;
            }
            left -= temp;
            res += shift;
        }
        return negative ? -res : res;
    }


}