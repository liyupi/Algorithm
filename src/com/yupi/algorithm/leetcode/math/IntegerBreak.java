package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：整数拆分
 * 思路：能拆3就拆3
 * LeetCode 343
 */

public class IntegerBreak {

    public int integerBreak(int n) {
        int num = n / 3;
        int left = n % 3;
        if (n < 4) {
            return n - 1;
        }
        if (left == 1) {
            return (int) Math.pow(3, num - 1) * 4;
        } else if (left ==  2) {
            return (int) Math.pow(3, num) * 2;
        } else {
            return (int) Math.pow(3, num);
        }
    }

}